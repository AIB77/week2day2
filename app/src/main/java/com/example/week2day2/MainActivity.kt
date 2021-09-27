package com.example.week2day2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var clMenu: ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clMenu = findViewById(R.id.clMain)


        val gam1bt = findViewById<Button>(R.id.btngame1)
        val gam2bt = findViewById<Button>(R.id.btngame2)

        gam1bt.setOnClickListener {
            val intent = Intent(this, game1::class.java)
            startActivity(intent)
        }
        gam2bt.setOnClickListener {
            val intent = Intent(this, game2::class.java)
            startActivity(intent)
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.game1mu -> {
                val intent = Intent(this, game1::class.java)
                startActivity(intent)
                return true
            }
            R.id.game2mu -> {
                val intent = Intent(this, game2::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}