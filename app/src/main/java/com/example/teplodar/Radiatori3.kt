package com.example.teplodar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teplodar.databinding.ActivityRadiatori3Binding
import com.example.teplodar.databinding.ActivityRadiatoriBinding
import com.example.teplodar.databinding.ActivityRadiatory2Binding

class Radiatori3 : AppCompatActivity() {
    lateinit var binding: ActivityRadiatori3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRadiatori3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonMetalloplast.setOnClickListener{
            val intent = Intent(this,RadiatoriVopros::class.java)
            metal = "ОСНОВНЫЕ\n- Уголки 16 90º 4 шт.\n- Муфты 16 2 шт.\n- Труба МП 16 2м."
            startActivity(intent)
        }
        binding.buttonShitik.setOnClickListener{
            val intent = Intent(this,RadiatoriVopros::class.java)
            startActivity(intent)
        }
        binding.buttonKran12.setOnClickListener{
            val intent = Intent(this,RadiatoriVopros::class.java)
            startActivity(intent)
        }
        binding.buttonEvrokonus.setOnClickListener{
            val intent = Intent(this,RadiatoriVopros::class.java)
            startActivity(intent)
        }

    }
    companion object{
        var metal :String=""
        var shitik :String=""
        var kran1_2 :String=""
        var evrokonus :String=""
    }
}