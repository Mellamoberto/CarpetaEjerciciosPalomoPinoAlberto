package com.example.permisos

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val callButton = findViewById<Button>(R.id.callButton)
        callButton.setOnClickListener { makePhoneCall() }
    }

    private fun makePhoneCall() {
        val phoneNumber = "tel:" + "123456789" // Replace with the actual phone number
        val dialIntent = Intent(Intent.ACTION_CALL, Uri.parse(phoneNumber))
        if (dialIntent.resolveActivity(packageManager) != null) {
            startActivity(dialIntent)
        } else {
            // Handle the case where the device doesn't have a dialer application installed
            // You might want to display an error message to the user
        }
    }
}

