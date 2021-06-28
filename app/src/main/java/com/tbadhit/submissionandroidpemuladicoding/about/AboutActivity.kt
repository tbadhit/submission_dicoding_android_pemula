package com.tbadhit.submissionandroidpemuladicoding.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tbadhit.submissionandroidpemuladicoding.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.title = "Profile"

        val btnBack: Button = findViewById(R.id.btn_back)

        btnBack.setOnClickListener {
            finish()
        }
    }
}