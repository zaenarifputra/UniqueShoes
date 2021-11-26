package com.example.uniqueshoes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb);
        val dalem = AnimationUtils.loadAnimation(this, R.anim.dalem);

        val uniq = findViewById(R.id.uniq) as ImageView
        val gm = findViewById(R.id.gm2) as ImageView
        val gm2 = findViewById(R.id.gm3) as ImageView
        val btn = findViewById(R.id.button) as Button
        val btn2 = findViewById(R.id.item) as ImageView
        val btn3 = findViewById(R.id.item2) as ImageView
        val clk = findViewById(R.id.clk) as TextView

        uniq.startAnimation(ttb)
        gm.startAnimation(dalem)
        gm2.startAnimation(dalem)
        btn.startAnimation(dalem)
        btn2.startAnimation(dalem)
        btn3.startAnimation(dalem)
        clk.startAnimation(dalem)



        val intentButton : Button = findViewById(R.id.button)
        intentButton.setOnClickListener{viewget()}


    }

    private fun viewget() {
        val intent = Intent (this, LoginActivity::class.java)
        startActivity(intent)
    }
}