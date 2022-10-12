package com.christian.rune

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

@RunWith(AndroidJUnit4::class)
class TitleScreenTestKotlin {

    @Test
    fun testNavigateToPlay() {
        // Create a TestNavHostController
        val navController = TestNavHostController(ApplicationProvider.getApplicationContext())
        navController.setGraph(R.navigation.navigation)

        // Create a graphical FragmentScenario for the TitleScreen
        val homeFragment = launchFragmentInContainer<homeFragment>()

        // Set the NavController property on the fragment
        homeFragment.onFragment { fragment ->
            Navigation.setViewNavController(fragment.requireView(), navController)
        }
        fun aboutclicked (view: View) {
        setCurrentDestination(R.id.aboutfragment)
       }
        
