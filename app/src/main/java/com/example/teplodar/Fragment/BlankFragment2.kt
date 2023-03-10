package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.R
import com.example.teplodar.databinding.FragmentBlank2Binding
import com.example.teplodar.databinding.FragmentBlankBinding

class BlankFragment2 : Fragment() {
    lateinit var binding: FragmentBlank2Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank2Binding.inflate(inflater)

        binding.buttonYes.setOnClickListener{
            //cдесь записывать данные
            NeptunYes="Нептун-Да\n1) Нептун 1шт \n2)нипель 1/2 н.н. 2 шт\n"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment3.newInstance())
                .commitNow()
        }
        binding.buttonNo.setOnClickListener{
            NeptunNo="Нептун-нет"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment3.newInstance())
                .commitNow()
        }


        return binding.root
    }
    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment2()
        var NeptunYes:String=""
        var NeptunNo:String=""
    }
}
