package com.example.teplodar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teplodar.Fragment.BlankFragment
import com.example.teplodar.databinding.FragmentBlankBinding

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout1,BlankFragment.newInstance())
            .commit()
    }
}