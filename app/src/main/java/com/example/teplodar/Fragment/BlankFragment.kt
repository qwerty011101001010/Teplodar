package com.example.teplodar.Fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teplodar.FragmentActivity
import com.example.teplodar.R
import com.example.teplodar.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    lateinit var binding: FragmentBlankBinding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(inflater)

        binding.buttonNext2.setOnClickListener{
            activity!!
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout1, BlankFragment2.newInstance())
                .commitNow()

                        //cдесь записывать данные

            naborkaNaVodZnach =binding.naborkaNaVvod.text.toString()

        }


        return binding.root
    }
    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment()
        var naborkaNaVodZnach:String=""
    }
}

