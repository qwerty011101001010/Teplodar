package com.example.teplodar


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teplodar.Fragment.BlankFragment
import com.example.teplodar.Fragment.BlankFragmentRadio


class FragmentRadioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_radio)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.FrameRadio, BlankFragmentRadio.newInstance())
            .commit()
    }
}
