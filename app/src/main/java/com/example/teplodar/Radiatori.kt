package com.example.teplodar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teplodar.OtpuskKanal.Companion.viborkanal
import com.example.teplodar.ViborOpuskaKan.Companion.viboropuskakan
import com.example.teplodar.ViborOpuskaKan.Companion.vibortroynik
import com.example.teplodar.databinding.ActivityRadiatoriBinding
import com.example.teplodar.viborObject.Companion.otvetKv

class Radiatori : AppCompatActivity() {
    lateinit var binding:ActivityRadiatoriBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRadiatoriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textVivod.setText(otvetKv+"\n"+viborkanal+"\n"+viboropuskakan+"\n"+vibortroynik)
    }
}