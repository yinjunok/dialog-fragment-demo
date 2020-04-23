package com.example.dialogfragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val showDialog = findViewById<Button>(R.id.show_dialog)
        val dialog = CustomDialog()
        showDialog.setOnClickListener {
            dialog.show(supportFragmentManager, "CustomDialog")
        }

        val showLogin = findViewById<Button>(R.id.show_login)
        val login = LoginDialog()
        showLogin.setOnClickListener {
            login.show(supportFragmentManager, "LoginDialog")
        }
    }
}
