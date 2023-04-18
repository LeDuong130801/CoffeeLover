package com.example.coffeelover.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coffeelover.R
import kotlinx.android.synthetic.main.activity_start_screen.*

class StartScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)
        genEvent()
    }

    fun genEvent(){
        bt_login.setOnClickListener {
            gotoLogin()
        }
        bt_register.setOnClickListener{
            gotoRegister()
        }
    }
    private fun gotoLogin(){
        val intentLogin = Intent(this, LoginScreen::class.java)
        startActivity(intentLogin)
        this.finish()
    }
    private fun gotoRegister(){
        val intentRegister = Intent(this, RegisterScreen::class.java)
        startActivity(intentRegister)
        this.finish()
    }
}