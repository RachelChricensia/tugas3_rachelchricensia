package com.example.mobilecomputing

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobilecomputing.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                enableEdgeToEdge()
                setContentView(R.layout.activity_main)

                binding = ActivityMainBinding.inflate(layoutInflater)
                setContentView(binding.root)

                binding.createacc.setOnClickListener{
                    val intentregister = Intent(this, register::class.java)
                    startActivity(intentregister)
                }

                binding.forgotpass.setOnClickListener{
                    val intentforgotps = Intent(this, forgotps::class.java)
                    startActivity(intentforgotps)
                }
                binding.createBtn.setOnClickListener{
                    val intenthome = Intent(this, home::class.java)
                    startActivity(intenthome)
                }
                ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                    insets
                }

            }
        }