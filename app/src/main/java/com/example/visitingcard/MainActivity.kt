package com.example.visitingcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        generateButton.setOnClickListener {
            setTextViews()
        }
    }

    private fun setTextViews(){
        nameTextView.text = nameText.text.toString()
        textView1.text = jobTitleText.text.toString()
        textView2.text = phoneText.text.toString()
        textView3.text = addressText.text.toString()
        textView4.text = emailText.text.toString()
    }
}