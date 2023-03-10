package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.R
import com.example.teplodar.databinding.*

class BlankFragment5 : Fragment() {
    lateinit var binding: FragmentBlank5Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank5Binding.inflate(inflater)

        binding.buttonObratKlaponYes.setOnClickListener {
            //cдесь записывать данные
            KlaponYes = "Клапон - Да\n1) обратный клапан 1шт"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment6.newInstance())
                .commitNow()
        }
        binding.buttonObratKlaponNo.setOnClickListener {
            KlaponNo = "Клапон - нет"
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment6.newInstance())
                .commitNow()
        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment5()
        var KlaponYes: String = ""
        var KlaponNo: String = ""
    }
}