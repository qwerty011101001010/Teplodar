package com.example.teplodar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.teplodar.Fragment.BlankFragmentRadio
import com.example.teplodar.databinding.ActivityRadiatoriBinding
import com.example.teplodar.databinding.ActivityRadiatory2Binding

class Radiatory2 : AppCompatActivity() {

    lateinit var binding: ActivityRadiatory2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRadiatory2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext.setOnClickListener{
            val intent = Intent(this,FragmentActivity::class.java)
            KolVoRadio="Количество радиаторов - "
            znachKolRadio=binding.numberRadio.text.toString()
            startActivity(intent)
        }
        binding.buttonBack4.setOnClickListener{
            val intent = Intent(this,OtpuskKanal::class.java)
            startActivity(intent)
        }



    }
    companion object{
        var KolVoRadio:String=""
        var znachKolRadio:String=""
    }
}