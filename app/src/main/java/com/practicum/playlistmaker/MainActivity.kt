package com.practicum.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSearch = findViewById<Button>(R.id.light_mode_search)

        buttonSearch.setOnClickListener {
            Snackbar.make(it, "Нажали на кнопку поиска!", Snackbar.LENGTH_SHORT).show()
            val displayIntent = Intent(this, SearchActivity::class.java)
            startActivity(displayIntent)
        }

        val buttonMedia = findViewById<Button>(R.id.light_mode_media)

        buttonMedia.setOnClickListener {
            Snackbar.make(it, "Нажали на кнопку медиатеки!", Snackbar.LENGTH_SHORT).show()
            val displayIntent = Intent(this, MediatekaActivity::class.java)
            startActivity(displayIntent)
        }

        val buttonSettings = findViewById<Button>(R.id.light_mode_settings)

        buttonSettings.setOnClickListener {
            Snackbar.make(it, "Нажали на кнопку настройки!", Snackbar.LENGTH_SHORT).show()
            val displayIntent = Intent(this, SettingsActivity::class.java)
            startActivity(displayIntent)
        }
    }
}
