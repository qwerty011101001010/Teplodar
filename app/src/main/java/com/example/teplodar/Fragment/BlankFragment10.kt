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
import com.example.teplodar.Fragment.BlankFragment2.Companion.NeptunNo
import com.example.teplodar.Fragment.BlankFragment2.Companion.NeptunYes
import com.example.teplodar.Fragment.BlankFragment2_1.Companion.NeptunNo1
import com.example.teplodar.Fragment.BlankFragment2_1.Companion.NeptunYes1
import com.example.teplodar.R
import com.example.teplodar.Radiatori
import com.example.teplodar.Radiatori3
import com.example.teplodar.Radiatory2
import com.example.teplodar.databinding.*

class BlankFragment10 : Fragment() {
    lateinit var binding: FragmentBlank10Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank10Binding.inflate(inflater)

        


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment10()





    }
}