package com.example.koeal.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""

    var skillSelected = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        //THIS IS RECEIVING DATA FROM THE PREVIOUS ACTIVITY
        league = intent.getStringExtra(EXTRA_LEAGUE) //accessing the value through the key value pair
        Toast.makeText(this,"You selected $league",Toast.LENGTH_SHORT).show()

//        finishButton.setOnClickListener {
//            val finishIntent = Intent(this, SkillActivity::class.java)
//            finishIntent.putExtra(EXTRA_SKILL,skillSelected)
//            startActivity(finishIntent)
//        }

    }

    fun beginnerClicked(view: View){
        advancedButton.isChecked = false
        skillSelected = "Beginner"
    }

    fun advancedClicked(view:View){
        beginnerButton.isChecked = false
        skillSelected = "Advanced"
    }

    fun finishClicked(view:View){
        if(skillSelected != ""){
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_SKILL,skillSelected)
            finishIntent.putExtra(EXTRA_LEAGUE,league)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this,"Please enter your skill level",Toast.LENGTH_SHORT)
        }

    }

}
