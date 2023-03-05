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
            OtvetPol = "Теплый пол - да"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragmentTepliyPol.newInstance())
                .commitNow()
        }
        binding.buttonNext.setOnClickListener{
            //cдесь записывать данные
            OtvetKolKol =binding.numberkollectors.text.toString()
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment2.newInstance())
                .commitNow()

        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragmentTepliyPol2()
        var OtvetPol: String = ""
        var OtvetKolKol: String = ""
    }
}