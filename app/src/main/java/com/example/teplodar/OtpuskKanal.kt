package com.example.teplodar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teplodar.databinding.ActivityOtpuskKanalBinding


class OtpuskKanal : AppCompatActivity() {
    lateinit var binding: ActivityOtpuskKanalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpuskKanalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonYes.setOnClickListener{
            val intent = Intent(this,ViborOpuskaKan::class.java)
            viborkanal = "Отпуск канализации - Да\n1) Рем.Раструб\n2) Труба 110 - 1м\n3) Компенсационная муфта 110"
            startActivity(intent)
        }
    }
    companion object
    {
        var viborkanal:String= ""
    }
}