package com.example.tugasbaru

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasbaru.databinding.ActivityMainBinding
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity3 : AppCompatActivity(), View.OnClickListener {

    private  lateinit var  tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        tv=findViewById(R.id.welcome)

        val usernamee = intent.getParcelableExtra<User>("User")?.username
        tv.text = "Welcome Nakama $usernamee"

        val btnFragment:Button = findViewById(R.id.btn_fragmen)
        btnFragment.setOnClickListener(this)

        val btnFragment2:Button = findViewById(R.id.btn_fragmen2)
        btnFragment2.setOnClickListener(this)

        }

    override fun onClick(v: View) {
       when(v.id){
           R.id.btn_fragmen ->{
               val intent = Intent(this@MainActivity3, fragmen::class.java)
               startActivity(intent)
           }
           R.id.btn_fragmen2 ->{
               val intent = Intent(this@MainActivity3, fragmen2::class.java)
               startActivity(intent)
           }
       }
    }
}
