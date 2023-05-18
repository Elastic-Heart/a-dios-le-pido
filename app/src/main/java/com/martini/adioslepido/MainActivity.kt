package com.martini.adioslepido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.martini.adioslepido.second.SecondActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button?>(R.id.myButton).apply {
            setOnClickListener(::goToSecondScreen)
        }
    }

    private fun goToSecondScreen(view: View) {
        Intent(this, SecondActivity::class.java).also {
            startActivity(it)
        }
    }
}