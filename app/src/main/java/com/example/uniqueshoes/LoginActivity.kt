package com.example.uniqueshoes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val intentButton : Button = findViewById(R.id.buttonn)
        intentButton.setOnClickListener{viewlogin()}
    }

    private fun viewlogin() {
        val intent = Intent(this, FragmentActivity::class.java)
        startActivity(intent)
    }


}