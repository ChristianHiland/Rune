package com.chrsitian.rune

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
           ApplicationProvider.getApplicationContext()).apply {
          setGraph(R.navigation.navigation)
          setCurrentDestination(R.id.mainFragment)
    }
    
     // Create a graphical homePage for the Home Page fragment
        val homePage = launchFragmentInContainer<homeFragment>()
           
    // Set the NavController property on the fragment
        homePage.onFragment { fragment ->
            Navigation.setViewNavController(fragment.requireView(), navController)
        }
    fun sendMessage(view: View) {
        setCurrentDestination(R.id.homeFragment)
    }
}
