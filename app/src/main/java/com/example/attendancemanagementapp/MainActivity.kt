package com.example.attendancemanagementapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.attendancemanagementapp.loginsignup.FirstScreenActivity

class MainActivity : AppCompatActivity() {
    private val SPLASH_SCREEN = 2500

    var anim: Animation? = null
    var top:Animation? = null
    var bottom:Animation? = null
    var textView: TextView? = null
    var imageView: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        imageView = findViewById<View>(R.id.imageView2) as ImageView // Declare an imageView to show the animation.

        textView = findViewById<View>(R.id.splashtext1) as TextView
//        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in); // Create the animation.
//        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in); // Create the animation.
        top = AnimationUtils.loadAnimation(this, R.anim.top)
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom)
        imageView!!.animation = top
        textView!!.animation = bottom
        //        imageView.startAnimation(anim);
        Handler().postDelayed({
            val intent = Intent(applicationContext, FirstScreenActivity::class.java)
            startActivity(intent)
            finish()
        }, this.SPLASH_SCREEN.toLong())
    }
}