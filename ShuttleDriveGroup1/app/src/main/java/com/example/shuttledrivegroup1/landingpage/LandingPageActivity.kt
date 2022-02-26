package com.example.shuttledrivegroup1.landingpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.shuttledrivegroup1.R
import com.example.shuttledrivegroup1.databinding.ActivityMainBinding
import com.example.shuttledrivegroup1.ui.HomeFragment

class LandingPageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        supportFragmentManager.commit {
//            add<HomeFragment>(R.id.container, null, null)
//        }
    }
}