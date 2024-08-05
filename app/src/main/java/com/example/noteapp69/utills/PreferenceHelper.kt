package com.example.noteapp69.utills

import android.content.Context
import android.content.SharedPreferences

class PreferenceHelper {

    private var sharedPreferences : SharedPreferences? = null

    fun unit(context: Context) {
        sharedPreferences = context.getSharedPreferences("shared", Context.MODE_PRIVATE)
    }

    var text: String?
        get() = sharedPreferences?.getString("text", "")
        set(value) = sharedPreferences?.edit()?.putString("text", value)!!.apply()

    var isOnBoardShown: Boolean
        get() = sharedPreferences?.getBoolean("isShown", false) == true
        set(value) = sharedPreferences?.edit()?.putBoolean("isShown", value)!!.apply()
}