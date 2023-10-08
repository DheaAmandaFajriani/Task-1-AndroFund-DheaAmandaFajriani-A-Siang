package com.example.tugasbaru

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity(), View.OnClickListener {


    private  lateinit var etusername: EditText
    private lateinit var  etpassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        etusername = findViewById(R.id.edt_username)
        etpassword = findViewById(R.id.edt_password)

        val bundle = intent.extras
        if(bundle !=null){
            etusername.setText(bundle.getString("username"))
            etpassword.setText(bundle.getString("password"))
        }


        val btnLogin2: Button = findViewById(R.id.btn_next)
        btnLogin2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_next -> {
                val intent = Intent(this@MainActivity2, MainActivity3::class.java)
                intent.putExtra("User",User(etusername.text.toString()))
                startActivity(intent)
            }

        }
    }


}