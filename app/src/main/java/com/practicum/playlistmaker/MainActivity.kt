package com.practicum.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSearch = findViewById<Button>(R.id.light_mode_search)

        val buttonSearchClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на кнопку поиска!", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        val buttonMedia = findViewById<Button>(R.id.light_mode_media)

        buttonMedia.setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажали на кнопку медиатека!", Toast.LENGTH_SHORT)
                .show()
        }

        val buttonSettings = findViewById<Button>(R.id.light_mode_settings)

        val buttonSettingsClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на кнопку настройки!", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        buttonSearch.setOnClickListener(buttonSearchClickListener)

        buttonSettings.setOnClickListener(buttonSettingsClickListener)
    }
}
