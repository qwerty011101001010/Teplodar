package com.example.teplodar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.teplodar.databinding.ActivityViborOpuskaKanBinding

class ViborOpuskaKan : AppCompatActivity() {
    lateinit var binding: ActivityViborOpuskaKanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViborOpuskaKanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonKrest.setOnClickListener{
            val intent = Intent(this,Radiatori::class.java)
            viboropuskakan = "Выбор - Крестовина"
            startActivity(intent)
        }
        binding.buttonTroynik.setOnClickListener{
            val intent = Intent(this,Radiatori::class.java)
            viboropuskakan = "Выбор - Тройник"
            startActivity(intent)
        }
        binding.buttonBack2.setOnClickListener{
            val intent = Intent(this,OtpuskKanal::class.java)
            startActivity(intent)
        }
    }
    companion object{
        var viboropuskakan:String=""

    }
}