package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.R
import com.example.teplodar.Radiatory2.Companion.znachKolRadio
import com.example.teplodar.databinding.*

class BlankFragmentResoult : Fragment() {
    lateinit var binding: FragmentBlankResoultBinding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankResoultBinding.inflate(inflater)
        //binding.textView7.setText()
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragmentRadio()
        var otvetRadio: String = ""
    }
}