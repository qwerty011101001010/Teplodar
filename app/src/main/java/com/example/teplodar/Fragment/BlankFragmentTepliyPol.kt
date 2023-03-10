package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.R
import com.example.teplodar.databinding.*

class BlankFragmentTepliyPol : Fragment() {
    lateinit var binding: FragmentBlankTepliyPolBinding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankTepliyPolBinding.inflate(inflater)

        binding.buttonPolYes.setOnClickListener {
            //cдесь записывать данные
            OtvetPol = "Теплый пол - да"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragmentTepliyPol2.newInstance())
                .commitNow()
        }
        binding.buttonPolNo.setOnClickListener {
            OtvetPol = "Теплый пол - нет"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragmentTepliyPol2.newInstance())
                .commitNow()
        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragmentTepliyPol()
        var OtvetPol: String = ""
    }
}