package com.example.shuttledrivegroup1.landingpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import com.example.shuttledrivegroup1.R
import com.example.shuttledrivegroup1.databinding.ActivityMainBinding
import com.example.shuttledrivegroup1.ui.HomeFragment

class LandingPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            add<HomeFragment>
        }

        binding.navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> goToHomeFragment()

                R.id.book_ride -> goToBookRideFragment()

                R.id.ride_history -> goToRideHistoryFragment()

                R.id.profile -> goToProfileFragment()

                else -> false
            }
        }

    }

    private fun goToBookRideFragment(): Boolean {
        supportFragmentManager.commit {
            replace<SettingFragment>(R.id.container, null, null)
        }

        return true

    }

    private fun goToRideHistoryFragment(): Boolean {
        supportFragmentManager.commit {
            replace<SettingFragment>(R.id.container, null, null)
        }

        return true

    }

    private fun goToSettingFragment(): Boolean {
        supportFragmentManager.commit {
            replace<SettingFragment>(R.id.container, null, null)
        }

        return true

    }

    private fun goToProfileFragment(): Boolean {
        supportFragmentManager.commit {
            replace<ProfileFragment>(R.id.container, null, null)
        }

        return true
    }

    private fun goToHomeFragment(): Boolean {
        supportFragmentManager.commit {
            replace<HomeFragment>(R.id.container, null, null)
        }

        return true
    }

}