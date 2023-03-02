package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.R
import com.example.teplodar.databinding.*

class BlankFragment6_1 : Fragment() {
    lateinit var binding: FragmentBlank61Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank61Binding.inflate(inflater)

        binding.buttonGryazYes.setOnClickListener {
            //cдесь записывать данные
            GryazYes1 = "Грязевик - Да\n1) Грязевик 1шт\n2) нипель 1/2 н.н. 1шт"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment7_1.newInstance())
                .commitNow()
        }
        binding.buttonGryazNo.setOnClickListener {
            GryazNo1 = "Грязевик - нет"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment7_1.newInstance())
                .commitNow()
        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment6_1()
        var GryazYes1: String = ""
        var GryazNo1: String = ""
    }
}