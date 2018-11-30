package com.example.koeal.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE) //accessing the value through the key value pair
        Toast.makeText(this,"You selected $league",Toast.LENGTH_SHORT).show()

        finishButton.setOnClickListener {
            val finishIntent = Intent(this, SkillActivity::class.java)
            startActivity(finishIntent)
        }

    }
}
