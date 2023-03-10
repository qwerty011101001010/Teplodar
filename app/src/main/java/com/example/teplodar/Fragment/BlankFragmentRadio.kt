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

class BlankFragmentRadio : Fragment() {
    lateinit var binding: FragmentBlankRadioBinding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankRadioBinding.inflate(inflater)

        binding.buttonMetalloplast.setOnClickListener{



            if(znachKolRadio >1.toString()) {
                otvetRadio = "ОСНОВНЫЕ\n- Уголки 16 90º 4 шт.\n- Муфты 16 2 шт.\n- Труба МП 16 2м."

                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragmentRadio2.newInstance())
                    .commitNow()
            }
            else
            {
                otvetRadio = "ОСНОВНЫЕ\n- Уголки 16 90º 4 шт.\n- Муфты 16 2 шт.\n- Труба МП 16 2м."
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragment.newInstance())
                    .commitNow()
            }

        }
        binding.buttonShitik.setOnClickListener{

            if(znachKolRadio > 1.toString()) {
                otvetRadio="ОСНОВНЫЕ\n- Уголки 16 90º 4 шт.\n- Муфты 16 2 шт.\n- Труба сшитик 16 2м"

                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.FrameRadio, BlankFragmentRadio2.newInstance())
                    .commitNow()
            }
            else
            {
                otvetRadio="ОСНОВНЫЕ\n- Уголки 16 90º 4 шт.\n- Муфты 16 2 шт.\n- Труба сшитик 16 2м"
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragment.newInstance())
                    .commitNow()
            }
        }
        binding.buttonKran12.setOnClickListener{

            if(znachKolRadio > 1.toString()) {


                otvetRadio="Кран 1/2 - 2 шт."

                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.FrameRadio, BlankFragmentRadio2.newInstance())
                    .commitNow()
            }
            else
            {
                otvetRadio="Кран 1/2 - 2 шт."
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragment.newInstance())
                    .commitNow()
            }
        }


        binding.buttonEvrokonus.setOnClickListener{

            if(znachKolRadio > 1.toString()) {
                otvetRadio="Евроконус 16 - 2 шт"

                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.FrameRadio, BlankFragmentRadio2.newInstance())
                    .commitNow()
            }
            else
            {
                otvetRadio="Евроконус 16 - 2 шт"
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragment.newInstance())
                    .commitNow()
            }

        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragmentRadio()
        var otvetRadio: String = ""
        var otvetRadio3: String = ""
        var radio=0

    }
}