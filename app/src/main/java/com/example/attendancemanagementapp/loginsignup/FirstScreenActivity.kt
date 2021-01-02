package com.example.attendancemanagementapp.loginsignup

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Pair
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.attendancemanagementapp.R

class FirstScreenActivity : AppCompatActivity() {
    private var smalltobig: Animation? = null
    private  var btta:Animation? = null
    private  var btta2:Animation? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_first_screen)
        val imageView = findViewById<ImageView>(R.id.first_icon)
        val textView = findViewById<TextView>(R.id.splashtext1)
        val l = findViewById<Button>(R.id.start_login)
        val s = findViewById<Button>(R.id.start_signup)
        smalltobig = AnimationUtils.loadAnimation(this, R.anim.a3)
        btta = AnimationUtils.loadAnimation(this, R.anim.a1)
        btta2 = AnimationUtils.loadAnimation(this, R.anim.a2)
        imageView.startAnimation(smalltobig)
        textView.startAnimation(btta)
        l.startAnimation(btta2)
        s.startAnimation(btta2)
    }

    fun callLoginScreen(view: View) {
        val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)

    }
    fun callSignUpScreen(view: View) {
        val intent = Intent(applicationContext, SignUpActivity::class.java)
        startActivity(intent)
    }
}