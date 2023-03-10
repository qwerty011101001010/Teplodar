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

class BlankFragmentRadio2 : Fragment() {
    lateinit var binding: FragmentBlankRadio2Binding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankRadio2Binding.inflate(inflater)

        binding.buttonMetalloplast.setOnClickListener{



            if(znachKolRadio > 2.toString()) {
                otvetRadio2 = "ОСНОВНЫЕ\n- Уголки 16 90º 4 шт.\n- Муфты 16 2 шт.\n- Труба МП 16 2м."
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragmentRadio.newInstance())
                    .commitNow()
            }
            else
            {
                otvetRadio2 = "ОСНОВНЫЕ\n- Уголки 16 90º 4 шт.\n- Муфты 16 2 шт.\n- Труба МП 16 2м."
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragment.newInstance())
                    .commitNow()
            }

        }
        binding.buttonShitik.setOnClickListener{

            if(znachKolRadio > 2.toString()) {
                otvetRadio2="ОСНОВНЫЕ\n- Уголки 16 90º 4 шт.\n- Муфты 16 2 шт.\n- Труба сшитик 16 2м"
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.FrameRadio, BlankFragmentRadio.newInstance())
                    .commitNow()
            }
            else
            {
                otvetRadio2="ОСНОВНЫЕ\n- Уголки 16 90º 4 шт.\n- Муфты 16 2 шт.\n- Труба сшитик 16 2м"
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragment.newInstance())
                    .commitNow()
            }
        }
        binding.buttonKran12.setOnClickListener{

            if(znachKolRadio > 2.toString()) {
                otvetRadio2="Кран 1/2 - 2 шт."
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.FrameRadio, BlankFragmentRadio.newInstance())
                    .commitNow()
            }
            else
            {
                otvetRadio2="Кран 1/2 - 2 шт."
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout1, BlankFragment.newInstance())
                    .commitNow()
            }
        }


        binding.buttonEvrokonus.setOnClickListener{

            if(znachKolRadio > 2.toString()) {
                otvetRadio2="Евроконус 16 - 2 шт"
                activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.FrameRadio, BlankFragmentRadio.newInstance())
                    .commitNow()
            }
            else
            {
                otvetRadio2="Евроконус 16 - 2 шт"
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
        fun newInstance() = BlankFragmentRadio2()
        var otvetRadio2: String = ""


    }
}