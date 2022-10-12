pakeage com.chrsitian.rune

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
          setCurrentDestination(R.id.)
    }

    fun sendMessage(view: View) {

    }
}
