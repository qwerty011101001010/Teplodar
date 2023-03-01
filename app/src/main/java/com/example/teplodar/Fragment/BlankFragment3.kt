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
import com.example.teplodar.databinding.FragmentBlankBinding

class BlankFragment3 : Fragment() {
    lateinit var binding:FragmentBlank3Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank3Binding.inflate(inflater)






        return binding.root
    }
    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment3()
    }
}
