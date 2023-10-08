package com.example.tugasbaru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private  lateinit var etemail:EditText
    private  lateinit var etusername:EditText
    private lateinit var  etpassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etemail = findViewById(R.id.edt_email)
        etusername = findViewById(R.id.edt_username)
        etpassword = findViewById(R.id.edt_password)

        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
       when(v.id){
           R.id.btn_login ->{

               val bundle = Bundle()
               bundle.putString("username",etusername.text.toString())
               bundle.putString("password",etpassword.text.toString())
               bundle.putString("email",etemail.text.toString())

               val intent = Intent(this@MainActivity, MainActivity2::class.java)
               intent.putExtras(bundle)
               startActivity(intent)
           }
       }
    }
}