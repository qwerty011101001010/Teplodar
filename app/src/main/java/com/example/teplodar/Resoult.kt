package com.example.teplodar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teplodar.databinding.ActivityMainBinding
import com.example.teplodar.databinding.ActivityResoultBinding

class Resoult : AppCompatActivity() {
    lateinit var binding: ActivityResoultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResoultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonChoice.setOnClickListener {
            val intent = Intent(this, TochnoResoult::class.java)
            dom = "Дом\nХата\n1) Рем.Раструб\n2) Труба 110 - 1м\n3) Компенсационная муфта 110ом\n" +
                    "Хата\n" +
                    "1) Рем.Раструб\n" +
                    "2) Труба 110 - 1м\n" +
                    "3) Компенсационная муфта 110ом\n" +
                    "Хата\n" +
                    "1) Рем.Раструб\n" +
                    "2) Труба 110 - 1м\n" +
                    "3) Компенсационная муфта 110ом\n" +
                    "Хата\n" +
                    "1) Рем.Раструб\n" +
                    "2) Труба 110 - 1м\n" +
                    "3) Компенсационная муфта 110"

            chislo=binding.editTextTextPersonName.text.toString()
            startActivity(intent)
        }


    }
    companion object
    {
        var dom:String = ""
        var chislo:String = ""
    }
}