package com.example.implicitintents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.implicitintents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPhone.setOnClickListener { openPhone() }
        binding.btnSms.setOnClickListener   { openSms("+601116367375") }
        binding.btnWeb.setOnClickListener   { openWeb() }
        binding.btnMap.setOnClickListener   { openMap() }
        binding.btnEmail.setOnClickListener { openEmail() }
    }

    private fun openPhone() {
        val uri = Uri.parse("tel: +601116367375")
        val intent = Intent(Intent.ACTION_DIAL, uri)
        startActivity(intent)

    }

    private fun openSms(phone: String) {
        val uri = Uri.parse("sms: $phone?body=Hello World")
        val intent = Intent(Intent.ACTION_SENDTO, uri)
        startActivity(intent)
    }

    private fun openWeb() {
        val uri = Uri.parse("https://www.tarc.edu.my")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    private fun openMap() {
        val uri = Uri.parse("geo: 0,0?q=3.215600,101.728105")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
    private fun openEmail() {
        val uri = Uri.parse("mailto: tongzh-wm19@student.tarc.edu.my?subject:Testing&body=Hello World")
        val intent = Intent(Intent.ACTION_SENDTO, uri)
        startActivity(intent)
    }
}