package com.example.teplodar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teplodar.databinding.ActivityRadiatoriBinding


class Radiatori : AppCompatActivity() {
    lateinit var binding:ActivityRadiatoriBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRadiatoriBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonYes.setOnClickListener{
            val intent = Intent()
        }


    }
}