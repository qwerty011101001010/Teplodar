package com.example.teplodar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teplodar.Resoult.Companion.chislo

import com.example.teplodar.Resoult.Companion.dom
import com.example.teplodar.databinding.ActivityTochnoResoultBinding
import com.example.teplodar.viborObject.Companion.otvetKv

class TochnoResoult : AppCompatActivity() {
    lateinit var binding: ActivityTochnoResoultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTochnoResoultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.setText(otvetKv+"\n"+dom+chislo)
    }

}