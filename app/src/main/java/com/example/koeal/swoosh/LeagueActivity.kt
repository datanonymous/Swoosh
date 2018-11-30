package com.example.koeal.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

//        leagueButton.setOnClickListener {
//            val skillIntent = Intent(this, SkillActivity::class.java)
//            startActivity(skillIntent)
//        }

    }

    //this is another way to click a button
    fun mensClicked(view: View){
        womenToggleButton.isChecked = false
        infantToggleButton.isChecked = false
        selectedLeague = "Mens"
}

    fun womensClicked(view: View){
        mensToggleButton.isChecked = false
        infantToggleButton.isChecked = false
        selectedLeague = "Womens"
    }

    fun infantClicked(view: View){
        mensToggleButton.isChecked = false
        womenToggleButton.isChecked = false
        selectedLeague = "Infant"
    }

    fun leagueNextButton(view:View){
        if (selectedLeague != ""){
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }

}
