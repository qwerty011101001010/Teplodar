package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.PointerIcon
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.Fragment.BlankFragment.Companion.naborkaNaVodZnach
import com.example.teplodar.R
import com.example.teplodar.databinding.*

class BlankFragment9 : Fragment() {
    lateinit var binding: FragmentBlank9Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank9Binding.inflate(inflater)

        binding.buttonZadShiiitYes.setOnClickListener {
            //cдесь записывать данные
            ZadShitYes = "Задний щит - Да\n1) Лист металла "

            if(naborkaNaVodZnach > 1.toString()){
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragment2_1.newInstance())
                    .commitNow()
            }
            else{
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragment9.newInstance())
                    .commitNow()
            }

        }
        binding.buttonZadshiiitNo.setOnClickListener {
            ZadShitNo = "Задний щит - Нет"
            if(naborkaNaVodZnach > 1.toString()){
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragment2_1.newInstance())
                    .commitNow()
            }
            else{
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragment9.newInstance())
                    .commitNow()
            }
        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment9()

        var ZadShitYes: String = ""
        var ZadShitNo: String = ""

    }
}