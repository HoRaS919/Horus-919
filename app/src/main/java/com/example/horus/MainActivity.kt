package com.example.horus

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val automationButton = findViewById<Button>(R.id.button_automation)
        val aiButton = findViewById<Button>(R.id.button_ai)
        val deviceControlButton = findViewById<Button>(R.id.button_device_control)
        val statusButton = findViewById<Button>(R.id.button_status)
        val settingsButton = findViewById<Button>(R.id.button_settings)

        automationButton.setOnClickListener { showToast("Automation functionality") }
        aiButton.setOnClickListener { showToast("AI functionality") }
        deviceControlButton.setOnClickListener { showToast("Device Control functionality") }
        statusButton.setOnClickListener { showToast("Status functionality") }
        settingsButton.setOnClickListener { showToast("Settings functionality") }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}