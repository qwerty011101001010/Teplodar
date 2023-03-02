package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.R
import com.example.teplodar.databinding.*

class BlankFragment6 : Fragment() {
    lateinit var binding: FragmentBlank6Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank6Binding.inflate(inflater)

        binding.buttonGryazYes.setOnClickListener {
            //cдесь записывать данные
            GryazYes = "Грязевик - Да\n1) Грязевик 1шт\n2) нипель 1/2 н.н. 1шт"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment7.newInstance())
                .commitNow()
        }
        binding.buttonGryazNo.setOnClickListener {
            GryazNo = "Грязевик - нет"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment7.newInstance())
                .commitNow()
        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment6()
        var GryazYes: String = ""
        var GryazNo: String = ""
    }
}