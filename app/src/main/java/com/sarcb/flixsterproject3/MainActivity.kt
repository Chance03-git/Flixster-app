package com.sarcb.flixsterproject3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sarcb.flixsterproject3.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.content, NowPlayingFragment(), null).commit()
    }
}
///