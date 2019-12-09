package com.example.ejm_botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonA.setOnClickListener{click(it)}
        buttonR.setOnClickListener{click(it)}
    }

    fun click(view: View) {
        /*when(view.id) {
            R.id.buttonA -> {/* code goes here */}
            R.id.buttonR -> {/* you can omit the braces if there is only a single expression */}
        }*/

        val btn = view as Button
        val intent = Intent(this, Activity_amosar::class.java)
        intent.putExtra("color", btn.text)
        startActivity(intent)
    }

}
