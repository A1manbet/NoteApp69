package com.example.noteapp69

import android.app.Application
import com.example.noteapp69.utills.PreferenceHelper

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        val sharedPreferences = PreferenceHelper()
        sharedPreferences.unit(this)
    }
}