package com.example.teplodar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teplodar.databinding.ActivityMainBinding
import com.example.teplodar.databinding.ActivityViborObjectBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonNextLayout.setOnClickListener{
            val intent = Intent(this, Resoult::class.java)
            startActivity(intent)
        }

        binding.buttonPO.setOnClickListener{
            val intent = Intent(this,viborObject::class.java)
            startActivity(intent)
        }
    }

}