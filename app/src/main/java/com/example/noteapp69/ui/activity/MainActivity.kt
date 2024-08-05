package com.example.noteapp69.ui.activity

import android.content.Context
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.noteapp69.R
import com.example.noteapp69.databinding.ActivityMainBinding
import com.example.noteapp69.ui.fragments.onboard.OnBoardFragment
import com.example.noteapp69.utills.PreferenceHelper

class MainActivity : AppCompatActivity() {


    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val preferenceHelper = PreferenceHelper()

        val navHostFragment = supportFragmentManager.
        findFragmentById(R.id.fragment_container) as NavHostFragment

        val navController = navHostFragment.navController

        if (preferenceHelper.isOnBoardShown) {
            navController.navigate(R.id.onBoardFragment)
        } else {
            navController.navigate(R.id.noteFragment)
        }
    }
}