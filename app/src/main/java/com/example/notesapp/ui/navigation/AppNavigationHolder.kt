package com.example.notesapp.ui.navigation

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router

object AppNavigatorHolder {
    val cicerone = Cicerone.create()
    val navigatorHolder: NavigatorHolder get() = cicerone.getNavigatorHolder()
    val router: Router get() = cicerone.router
}
