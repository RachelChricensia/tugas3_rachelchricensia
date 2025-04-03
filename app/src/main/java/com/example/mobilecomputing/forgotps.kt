package com.example.mobilecomputing

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobilecomputing.databinding.ActivityForgotpsBinding
import com.example.mobilecomputing.databinding.ActivityMainBinding

class forgotps : AppCompatActivity() {
    private lateinit var binding: ActivityForgotpsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forgotps)

        binding = ActivityForgotpsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.reset.setOnClickListener{
            val intentLoginActivity = Intent(this, MainActivity::class.java)
            startActivity(intentLoginActivity)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}