package com.msn.toastlibrary

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.msn.toastlibrary.databinding.ActivityMyLoadingBinding

class MyLoadingActivity : AppCompatActivity() {
    lateinit var binding:ActivityMyLoadingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMyLoadingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.run {
            button.setOnClickListener {
                Toast.makeText(this@MyLoadingActivity, "button clicked", Toast.LENGTH_SHORT).show()
                main.setBackgroundColor(Color.BLUE)
            }
        }

    }
}