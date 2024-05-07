package com.vbounties.trufriend.features.presentation.navigation

import com.vbounties.trufriend.features.presentation.navigation.`object`.ParentNavigation

sealed class BottomNavigation(val route: String) {
    object Home : BottomNavigation("home")
    object Search : BottomNavigation("search")
    object Learn: BottomNavigation("learn")
    object Tracker : BottomNavigation("tracker")
}