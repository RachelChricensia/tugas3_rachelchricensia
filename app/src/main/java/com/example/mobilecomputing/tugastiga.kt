package com.example.mobilecomputing

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobilecomputing.databinding.ActivityTugastigaBinding

class tugastiga : AppCompatActivity() {
private lateinit var binding: ActivityTugastigaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugastigaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.sendbutton.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,binding.pesan.text.toString())
            intent.type = "text/plain"

            try {
                startActivity(Intent.createChooser(intent, "Share To : "))
            } catch (e: ActivityNotFoundException) {
                // Tangani kasus jika tidak ada aplikasi yang bisa menangani intent ini
                // Contoh: Tampilkan pesan toast kepada pengguna
                Toast.makeText(this, "Tidak ada aplikasi yang dapat melakukan tindakan ini.", Toast.LENGTH_SHORT).show()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}