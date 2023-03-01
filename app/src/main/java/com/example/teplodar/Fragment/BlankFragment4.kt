package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.R
import com.example.teplodar.databinding.FragmentBlank2Binding
import com.example.teplodar.databinding.FragmentBlank3Binding
import com.example.teplodar.databinding.FragmentBlank4Binding
import com.example.teplodar.databinding.FragmentBlankBinding

class BlankFragment4 : Fragment() {
    lateinit var binding: FragmentBlank4Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank4Binding.inflate(inflater)

        binding.buttonReductorYes.setOnClickListener {
            //cдесь записывать данные
            ReductorYes = "Редуктор-Да\n1) Редуктор 1шт  \n2)  нипель 1/2 н.н. 1шт"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment4.newInstance())
                .commitNow()
        }
        binding.buttonReductorNo.setOnClickListener {
            ReductorNo = "Редуктор-нет"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment4.newInstance())
                .commitNow()
        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment4()
        var ReductorYes: String = ""
        var ReductorNo: String = ""
    }
}