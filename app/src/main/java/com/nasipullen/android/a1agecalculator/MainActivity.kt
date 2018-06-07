package com.nasipullen.android.a1agecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvBirth.setText("")
    }

    fun calculateAge(view: View){
       val dob : String = eBirth.text.toString()
       val currentYear =Calendar.getInstance().get(Calendar.YEAR)
       val age = currentYear - dob.toInt()
       tvBirth.setText("Umur Kamu Yaitu $age")
   }
}
