package com.example.koeal.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var finishLeague = ""
    var finishSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        //THIS IS RECEIVING DATA FROM THE PREVIOUS ACTIVITY
        finishLeague = intent.getStringExtra(EXTRA_LEAGUE) //accessing the value through the key value pair
        finishSkill = intent.getStringExtra(EXTRA_SKILL)
        Toast.makeText(this,"You selected league: $finishLeague \n You selected skill: $finishSkill", Toast.LENGTH_SHORT).show()

        finalEditText.setText("Looking for a $finishLeague league with a $finishSkill skill level...")
    }
}
