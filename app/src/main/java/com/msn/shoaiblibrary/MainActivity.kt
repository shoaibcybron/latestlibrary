package com.msn.shoaiblibrary

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.msn.myapp.R
import com.msn.myapp.databinding.ActivityMainBinding
import com.msn.toastlibrary.MyLoadingActivity
import com.msn.toastlibrary.Toaster

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.hello.setOnClickListener {
            startActivity(Intent(this@MainActivity,MyLoadingActivity::class.java))
        }
       Toaster.myMethod(this,"Shoaib Nasir Toast")
    }
}