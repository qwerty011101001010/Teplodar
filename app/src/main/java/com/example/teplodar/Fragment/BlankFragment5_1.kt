package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.R
import com.example.teplodar.databinding.*

class BlankFragment5_1 : Fragment() {
    lateinit var binding: FragmentBlank51Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank51Binding.inflate(inflater)

        binding.buttonObratKlaponYes.setOnClickListener {
            //cдесь записывать данные
            KlaponYes1 = "Клапон - Да\n1) обратный клапан 1шт"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment6_1.newInstance())
                .commitNow()
        }
        binding.buttonObratKlaponNo.setOnClickListener {
            KlaponNo1 = "Клапон - нет"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment6_1.newInstance())
                .commitNow()
        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment5_1()
        var KlaponYes1: String = ""
        var KlaponNo1: String = ""
    }
}