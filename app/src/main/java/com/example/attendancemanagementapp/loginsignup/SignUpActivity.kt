package com.example.attendancemanagementapp.loginsignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.attendancemanagementapp.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun nextSignUpScreen(view: View) {}
    fun callLoginScreen(view: View) {}
}