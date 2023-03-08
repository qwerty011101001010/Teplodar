package com.example.teplodar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teplodar.databinding.ActivityViborObjectBinding

class viborObject : AppCompatActivity() {
    lateinit var binding: ActivityViborObjectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViborObjectBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonKvartira.setOnClickListener{
            val intent = Intent(this,OtpuskKanal::class.java)
            otvetObject = "Объект - Квартира"
            startActivity(intent)
        }
        binding.buttonHome.setOnClickListener{
            val intent = Intent(this,OtpuskKanal::class.java)
            otvetObject = "Объект - Дом"
            startActivity(intent)
        }
        binding.buttonHome3.setOnClickListener{
            val intent = Intent(this,OtpuskKanal::class.java)
            otvetObject = "Объект - Ангар"
            startActivity(intent)
        }
        binding.buttonBack.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
    companion object
    {
        var otvetObject:String = ""
    }

}