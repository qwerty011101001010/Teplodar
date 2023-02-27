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
            vibortroynik = "Выбор - Тройник"
            startActivity(intent)
        }
    }
    companion object{
        var viboropuskakan:String=""
        var vibortroynik:String=""
    }
}