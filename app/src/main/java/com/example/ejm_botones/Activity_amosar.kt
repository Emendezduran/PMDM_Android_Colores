package com.example.ejm_botones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import kotlinx.android.synthetic.main.activity_amosar.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.singleTop

class Activity_amosar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amosar)
        buttonV.setOnClickListener { clickBack(it) }
        val message = intent.getStringExtra("color")
        textView.text = message
        buttonG.setOnClickListener { clickGoogle(it, message) }
    }

    private fun clickGoogle(view: View? , message: String) {
        browse("http://google.es/search?q=" + message)
    }

    fun clickBack(view: View) {
        startActivity(intentFor<MainActivity>("id" to 5).singleTop())
    }
}
