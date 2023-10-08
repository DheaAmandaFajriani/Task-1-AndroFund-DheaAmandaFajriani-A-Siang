package com.example.tugasbaru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class fragmen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragmen2)
        val fragmentManager : FragmentManager = supportFragmentManager
        val notification = Notification()
        val fragment = fragmentManager.findFragmentByTag(Notification::class.java.simpleName)

        if(fragment !is Home){
            fragmentManager
                .beginTransaction()
                .add(R.id.container2, notification, Notification::class.java.simpleName)
                .commit()
        }
    }
}