package com.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        handleUsername()

        binding.buttonNewMessage.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_new_message) {
            var s = ""
        }
    }

    private fun handleUsername() {
        val name = SecurityPreferences(this).getUsername("USERNAME")
        binding.textPerson.text = "Hello, $name!"
    }
}