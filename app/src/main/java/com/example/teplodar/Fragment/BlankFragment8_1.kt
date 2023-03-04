package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.PointerIcon
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.R
import com.example.teplodar.databinding.*

class BlankFragment8_1 : Fragment() {
    lateinit var binding: FragmentBlank81Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank81Binding.inflate(inflater)

        binding.buttonMetalloplast2.setOnClickListener {
            //cдесь записывать данные
            Metalloplast21 = "Металлопластик \n ОСНОВНЫЕ\n1) переход 1/2 н.р. на 16мп\n2) труба 16 2м\n3) переход 20 на 16 мп\n4) сгон прямой 1/2"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment9_1.newInstance())
                .commitNow()
        }
        binding.buttonPolypropilen.setOnClickListener {
            Polypropilen1 = "Полипропилен - Да\n1) МРН 1шт"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment9_1.newInstance())
                .commitNow()
        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment8_1()
        var Metalloplast21: String = ""
        var Polypropilen1: String = ""
    }
}