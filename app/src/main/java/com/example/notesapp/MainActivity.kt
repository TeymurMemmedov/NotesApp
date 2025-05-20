package com.example.notesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.notesapp.ui.navigation.AppNavigatorHolder
import com.example.notesapp.ui.navigation.Screens
import com.github.terrakok.cicerone.androidx.AppNavigator

class MainActivity : AppCompatActivity() {


    private val navigator = AppNavigator(this, R.id.fragment_container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initial screen
        if (savedInstanceState == null) {
            AppNavigatorHolder.router.navigateTo(Screens.home())
        }
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        AppNavigatorHolder.navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        AppNavigatorHolder.navigatorHolder.removeNavigator()
        super.onPause()
    }
}
