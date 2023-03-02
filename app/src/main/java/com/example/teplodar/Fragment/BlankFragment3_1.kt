package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.R
import com.example.teplodar.databinding.FragmentBlank2Binding
import com.example.teplodar.databinding.FragmentBlank31Binding
import com.example.teplodar.databinding.FragmentBlank3Binding
import com.example.teplodar.databinding.FragmentBlankBinding

class BlankFragment3_1 : Fragment() {
    lateinit var binding: FragmentBlank31Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank31Binding.inflate(inflater)

        binding.buttonFiltrYes.setOnClickListener {
            //cдесь записывать данные
            FilrtYes1 = "Фильтр-Да\n1) Фильтр 1шт \n2) уголок 1/2 в.н. 1 шт  1/2 н.н. 2 шт\n3 ) Хомут 40\n " +
                    "4 ) хомут 2шт\n5 ) шланг 0,3\n6 ) переход 1/2  на штуцер 1 шт\n7 ) заглушка 50º"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment4_1.newInstance())
                .commitNow()
        }
        binding.buttonFiltrNo.setOnClickListener {
            FiltrNo1 = "Фильтр-нет"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment4_1.newInstance())
                .commitNow()
        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment3_1()
        var FilrtYes1: String = ""
        var FiltrNo1: String = ""
    }
}
