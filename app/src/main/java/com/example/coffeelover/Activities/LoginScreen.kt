package com.example.coffeelover.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.coffeelover.R
import kotlinx.android.synthetic.main.activity_login_screen.*
import kotlinx.android.synthetic.main.activity_main.view.*

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

    }

    fun genEvent(){
        // click cua dang nhap
        bt_login.setOnClickListener {
            //check

            loginProcess()
        }
    }
    fun gotoRegister(){
        val registerIntent = Intent(this, RegisterScreen::class.java)
        startActivity(registerIntent)
        this.finish()
    }
    fun loginProcess(){
        //login process

        //intent
//        val homeIntent = Intent(this, HomeScreen::class.java)
//        startActivity(homeIntent)
//        this.finish()
    }
//  unused
//    fun gotoForgotPassword(){
//        val registerIntent = Intent(this, RegisterScreen::class.java)
//        startActivity(registerIntent)
//        this.finish()
//    }

}