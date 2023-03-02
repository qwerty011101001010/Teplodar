package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.PointerIcon
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.teplodar.Fragment.BlankFragment.Companion.naborkaNaVodZnach
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

        binding.buttonZadShiiitYes.setOnClickListener {
            //cдесь записывать данные
            ZadShitYes1 = "Задний щит - Да\n1) Лист металла "


            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment10.newInstance())
                .commitNow()
            }


        binding.buttonZadshiiitNo.setOnClickListener {
            ZadShitNo1 = "Задний щит - Нет"

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
        fun newInstance() = BlankFragment9_1()


        var ZadShitYes1: String = ""
        var ZadShitNo1: String = ""




    }
}