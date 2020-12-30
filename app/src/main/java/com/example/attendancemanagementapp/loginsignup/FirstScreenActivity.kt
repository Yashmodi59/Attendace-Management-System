package com.example.attendancemanagementapp.loginsignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.attendancemanagementapp.R

class FirstScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)
    }

    fun callLoginScreen(view: View) {}
    fun callSignUpScreen(view: View) {}
}