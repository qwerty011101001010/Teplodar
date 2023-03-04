package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.PointerIcon
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.Fragment.BlankFragment.Companion.naborkaNaVodZnach
import com.example.teplodar.MainActivity
import com.example.teplodar.R
import com.example.teplodar.databinding.*

class BlankFragment9_1 : Fragment() {
    lateinit var binding: FragmentBlank91Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank91Binding.inflate(inflater)

        binding.buttonZadShiiitYes1.setOnClickListener {
            //cдесь записывать данные
           ZadShitOtvet1 = "Задний щит - да"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragmentTepliyPol.newInstance())
                .commitNow()
        }
        binding.buttonZadshiiitNo1.setOnClickListener {
            ZadShitOtvet1= "Задний щит - нет"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragmentTepliyPol.newInstance())
                .commitNow()
        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment9_1()

        var ZadShitOtvet1: String = ""

    }
}