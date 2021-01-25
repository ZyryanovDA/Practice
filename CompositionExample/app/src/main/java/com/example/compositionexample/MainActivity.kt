package com.example.compositionexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val assasinArray = ArrayList<AssasinAction> ()
        assasinArray.add(Akira(100, 0, 100, 50))
        assasinArray.add(Tecyuo(100, 100))


    }
}