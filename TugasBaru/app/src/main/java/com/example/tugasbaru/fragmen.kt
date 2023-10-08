package com.example.tugasbaru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class fragmen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragmen)

        val fragmentManager : FragmentManager = supportFragmentManager
        val home = Home()
        val fragment = fragmentManager.findFragmentByTag(Home::class.java.simpleName)

        if(fragment !is Home){
            fragmentManager
                .beginTransaction()
                .add(R.id.container, home, Home::class.java.simpleName)
                .commit()
        }

    }
}