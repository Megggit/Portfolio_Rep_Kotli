package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.btnskills)
        val buttonEdcation = findViewById<Button>(R.id.btneducation)
        val buttonExperience = findViewById<Button>(R.id.btnexperience)
        val buttonAchievemnts = findViewById<Button>(R.id.btnachievements)



        buttonSkills.setOnClickListener {
            intent = Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }

        buttonEdcation.setOnClickListener {
            intent = Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }

        buttonAchievemnts.setOnClickListener {
            intent = Intent(this,AchievementActivity::class.java)
            startActivity(intent)
        }

        buttonExperience.setOnClickListener {
            intent = Intent(this,ExperienceActivity::class.java)
            startActivity(intent)
        }
    }
}