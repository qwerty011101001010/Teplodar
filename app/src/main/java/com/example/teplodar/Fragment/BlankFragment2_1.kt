package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.R
import com.example.teplodar.databinding.FragmentBlank21Binding
import com.example.teplodar.databinding.FragmentBlank2Binding

class BlankFragment2_1 : Fragment() {
    lateinit var binding: FragmentBlank21Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank21Binding.inflate(inflater)

        binding.buttonYes.setOnClickListener{
            //cдесь записывать данные
            NeptunYes1="Нептун-Да\n1) Нептун 1шт \n2)нипель 1/2 н.н. 2 шт"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment3_1.newInstance())
                .commitNow()
        }
        binding.buttonNo.setOnClickListener{
            NeptunNo1="Нептун-нет"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment3_1.newInstance())
                .commitNow()
        }


        return binding.root
    }
    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment2_1()
        var NeptunYes1:String=""
        var NeptunNo1:String=""
    }
}
