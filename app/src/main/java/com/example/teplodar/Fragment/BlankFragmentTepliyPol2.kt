package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.R
import com.example.teplodar.databinding.*

class BlankFragmentTepliyPol2 : Fragment() {
    lateinit var binding: FragmentBlankTepliyPol2Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankTepliyPol2Binding.inflate(inflater)

        binding.buttonNext.setOnClickListener {
            //cдесь записывать данные
            OtvetKolKol = binding.KolKol.text.toString()
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragmentTepliyPol3.newInstance())
                .commitNow()
        }



        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragmentTepliyPol2()
        var OtvetKolKol: String = ""
    }
}