package com.motivation

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {
    private val security: SharedPreferences =
        context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    fun storeUsername(key: String, str: String) {
        security.edit().putString(key, str).apply()
    }

    fun getUsername(key: String): String {
        return security.getString(key, "") ?: ""
    }

}