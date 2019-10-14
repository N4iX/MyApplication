package com.example.taruc.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {//on create = main function
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)//Display the UI, R = resources = manage the "res" folder
        //TODO continue your work here

        val buttonShowName: Button = findViewById(R.id.buttonShowName)//val = value (fixed), var = variable (can be changed later)

        buttonShowName.setOnClickedListener(showName())
    }

    private fun showName(){
        textViewName.setText("Chew Hao Xian")
    }

}
