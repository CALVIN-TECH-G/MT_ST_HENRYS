package com.mt_st_henrys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun later(view: View) {
        val i = Intent(this,henrydraw::class.java)
        startActivity(i)
        finish()
    }

    fun sign1(view: View) {
        val i = Intent(this,signin::class.java)
        startActivity(i)
        finish()
    }

    fun loglash(view: View) {
        val i = Intent(this,login::class.java)
        startActivity(i)
        finish()
    }
}