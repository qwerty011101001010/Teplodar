package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.PointerIcon
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.Fragment.BlankFragment.Companion.naborkaNaVodZnach
import com.example.teplodar.MainActivity
import com.example.teplodar.R
import com.example.teplodar.Radiatory2
import com.example.teplodar.Radiatory2.Companion.znachKolRadio
import com.example.teplodar.databinding.*

class BlankFragmentRadio2 : Fragment() {
    lateinit var binding: FragmentBlankRadio2Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankRadio2Binding.inflate(inflater)

        binding.buttonMetalloplast.setOnClickListener{
            if(znachKolRadio > 1.toString()) {
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.FrameRadio, BlankFragment2_1.newInstance())
                    .commitNow()
            }

        }
        binding.buttonShitik.setOnClickListener{
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.FrameRadio, BlankFragment9.newInstance())
                .commitNow()
        }
        binding.buttonKran12.setOnClickListener{

        }


        binding.buttonEvrokonus.setOnClickListener{
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.FrameRadio, BlankFragment9.newInstance())
                .commitNow()
        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragmentRadio2()



    }
}