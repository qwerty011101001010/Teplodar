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
        binding.buttonNext.setOnClickListener{
            //cдесь записывать данные
            OtvetKolKol = binding.numberkollectors.text.toString()
            OsnovaPola = "1) Коллектор на "+OtvetKolKol+" контуров\n2) насосно смесительный узел 1шт\n3) насос  1 шт\n4) преход 1ʹв.р. на 3/4 н.р.\n" +
                    "5) кран 3/4  в.н. \n6) сгон прямой ¾\n7) eвроконус - "+ OtvetKolKol.toInt()*2+"\nхуй"
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
        var OsnovaPola: String = ""
        var OtvetKolKol: String = ""
    }
}