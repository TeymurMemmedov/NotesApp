package com.example.notesapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notesapp.ui.navigation.AppNavigatorHolder
import com.example.notesapp.BaseFragment
import com.example.notesapp.GenericRvAdapter
import com.example.notesapp.Note
import com.example.notesapp.data.NotesRepositoryImplFake
import com.example.notesapp.databinding.FragmentHomeBinding
import com.example.notesapp.databinding.RvItemNoteBinding

class HomeFragment: BaseFragment<FragmentHomeBinding>(
    FragmentHomeBinding::inflate
), HomeContract.HomeView {

    lateinit var rvAdapter: GenericRvAdapter<Note,RvItemNoteBinding>

    val presenter = HomePresenterImpl(AppNavigatorHolder.router,NotesRepositoryImplFake())



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding.btnCreatePost.setOnClickListener {
           OnClickToCreateNote()
        }

        rvAdapter = GenericRvAdapter(
            inflater = RvItemNoteBinding::inflate,
            bindViewHolder = {binding,note,position->
                binding.tvNoteContent.text = note.content
            }
        )

        binding.rvNotes.also {
            it.adapter = rvAdapter
            it.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        }

        showNotes()

        return binding.root

    }

    override fun OnClickToCreateNote() {
        presenter.navigateToCreateNote()
    }

    override fun showNotes() {
        rvAdapter.sendListToAdapter(
            presenter.fetchNotes()
        )

    }
}