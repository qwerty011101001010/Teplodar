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
            otvetKv = "Объект - Квартира"
            startActivity(intent)
        }
    }
    companion object
    {
        var otvetKv:String = ""
    }

}