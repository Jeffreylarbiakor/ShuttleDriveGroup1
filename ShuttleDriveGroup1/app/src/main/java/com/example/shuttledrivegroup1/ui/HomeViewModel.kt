package com.example.shuttledrivegroup1.ui

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.example.shuttledrivegroup1.R
import com.example.shuttledrivegroup1.utils.FileHelper

class HomeViewModel(app: Application) : AndroidViewModel(app) {

    init {
        val text = FileHelper.getTextFromResources(app, R.raw.drivers)
        // val text = FileHelper.getTextFromAssets(app, "learners.json")
        Log.d("DATA", text)
        // parseText(text)
    }
}