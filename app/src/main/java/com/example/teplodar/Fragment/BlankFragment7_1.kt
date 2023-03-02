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

class BlankFragment7_1 : Fragment() {
    lateinit var binding: FragmentBlank71Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank71Binding.inflate(inflater)

        binding.buttonPodvodYes.setOnClickListener {
            //cдесь записывать данные
            PodvodYes1 = "Подвод - Да\nОСНОВНЫЕ\n1) кран 1/2 "
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment8_1.newInstance())
                .commitNow()
        }
        binding.buttonPodvodNo.setOnClickListener {
            PodvodNo1 = "Подвод - нет"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment8_1.newInstance())
                .commitNow()
        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment7_1()
        var PodvodYes1: String = ""
        var PodvodNo1: String = ""
    }
}