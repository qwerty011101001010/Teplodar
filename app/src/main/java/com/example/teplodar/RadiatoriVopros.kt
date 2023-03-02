package com.example.teplodar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teplodar.Fragment.BlankFragment.Companion.naborkaNaVodZnach
import com.example.teplodar.Fragment.BlankFragment2
import com.example.teplodar.Fragment.BlankFragment2.Companion.NeptunNo
import com.example.teplodar.Fragment.BlankFragment2.Companion.NeptunYes
import com.example.teplodar.Fragment.BlankFragment2_1
import com.example.teplodar.Fragment.BlankFragment2_1.Companion.NeptunNo1
import com.example.teplodar.Fragment.BlankFragment2_1.Companion.NeptunYes1
import com.example.teplodar.Radiatori.Companion.peredelkaRadio
import com.example.teplodar.Radiatori3.Companion.metal
import com.example.teplodar.Radiatory2.Companion.KolVoRadio
import com.example.teplodar.Radiatory2.Companion.znachKolRadio
import com.example.teplodar.databinding.ActivityRadiatoriVoprosBinding
import com.example.teplodar.databinding.ActivityTochnoResoultBinding


class RadiatoriVopros : AppCompatActivity() {
    lateinit var binding: ActivityRadiatoriVoprosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadiatoriVoprosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView9.setText(peredelkaRadio+"\n"+ KolVoRadio+ znachKolRadio+"\n"+metal)

        binding.Buttonkurlick.setOnClickListener{
            val intent = Intent(this,FragmentActivity::class.java)
            startActivity(intent)
        }
    }
}