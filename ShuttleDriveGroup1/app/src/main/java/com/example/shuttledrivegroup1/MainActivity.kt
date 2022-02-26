package com.example.shuttledrivegroup1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.shuttledrivegroup1.data.AdminLogin
import com.example.shuttledrivegroup1.data.UserSignUp
import com.example.shuttledrivegroup1.landingpage.LandingPageActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtn = findViewById<Button>(R.id.login_main)
        loginBtn.setOnClickListener(){
            val intent = Intent(this@MainActivity, LandingPageActivity::class.java)
            startActivity(intent)
        }

        val signUpBtn = findViewById<TextView>(R.id.signUp)
        signUpBtn.setOnClickListener(){
            val intent = Intent(this, UserSignUp::class.java)
            startActivity(intent)
        }

        val adminLogInBtn = findViewById<TextView>(R.id.admin_login)
        adminLogInBtn.setOnClickListener(){
            val intent = Intent(this, AdminLogin::class.java)
            startActivity(intent)
        }


    }
}