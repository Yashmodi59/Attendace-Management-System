package com.example.attendancemanagementapp.loginsignup

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import com.example.attendancemanagementapp.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.util.*


class LoginActivity : AppCompatActivity() {
    lateinit var email: TextInputLayout
    lateinit var password: TextInputLayout
    lateinit var editEmail: TextInputEditText
    lateinit var editPass:TextInputEditText
    lateinit var rememberMe: CheckBox
    var PREFS_NAME = "mypre"
    var PREF_USERNAME = "username"
    var PREF_PASSWORD = "password"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email = findViewById(R.id.login_email)
        editEmail = findViewById(R.id.loginEmaileditText)
        editPass = findViewById(R.id.loginPasswordeditText)
        password = findViewById(R.id.loginpassword)
        rememberMe = findViewById(R.id.loginremember)
        val sessionManager = SessionManager(this@LoginActivity,
                SessionManager.SESSION_REMEMBERME)
        if (sessionManager.checkRememberMe()) {
            val rememberMeDetails: HashMap<String, String> = sessionManager.getRememberMeUserDetailFromSession()
            this.editPass.setText(rememberMeDetails[SessionManager.KEY_SESSIONPASSWORD])
            this.editEmail.setText(rememberMeDetails[SessionManager.KEY_SESSIONPHONENUMBER])
        }

    }

    fun callForgetPasswordActivity(view: View) {}
    fun letUserLoggedIn(view: View) {}
    fun callSignUpScreen(view: View) {}
}