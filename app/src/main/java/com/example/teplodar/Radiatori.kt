package com.example.teplodar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teplodar.databinding.ActivityRadiatoriBinding


class
Radiatori : AppCompatActivity() {
    lateinit var binding:ActivityRadiatoriBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRadiatoriBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonYes.setOnClickListener{
            val intent = Intent(this,Radiatory2::class.java)
            peredelkaRadio = "Переделка радиаторов - Да"
            startActivity(intent)
        }
        binding.buttoNO.setOnClickListener{
            val intent = Intent(this,FragmentActivity::class.java)
            peredelkaRadio = "Переделка радиаторов - Нет"
            startActivity(intent)
        }
        binding.buttonBack3.setOnClickListener{
            val intent = Intent(this,OtpuskKanal::class.java)

            startActivity(intent)
        }
    }
    companion object{
        var peredelkaRadio:String=""
    }
}