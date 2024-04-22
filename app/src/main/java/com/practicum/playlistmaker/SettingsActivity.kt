package com.practicum.playlistmaker

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val buttonBackToMain = findViewById<ImageView>(R.id.back_to_main_button)

        buttonBackToMain.setOnClickListener {
            val displayIntent = Intent(this, MainActivity::class.java)
            startActivity(displayIntent)
        }

        val buttonShare = findViewById<ImageView>(R.id.share_button)

        buttonShare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            val message = "https://practicum.yandex.ru/android-developer/"
            shareIntent.putExtra(Intent.EXTRA_TEXT, message)
            val chooserIntent = Intent.createChooser(shareIntent, "Поделиться приложением")
            startActivity(chooserIntent)
        }

        val buttonGroup = findViewById<ImageView>(R.id.group_button)
        val supportEmail = "адрес_почты_студента"
        buttonGroup.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(
                    Intent.EXTRA_EMAIL,
                    arrayOf(supportEmail),
                )
                putExtra(
                    Intent.EXTRA_SUBJECT,
                    "Сообщение разработчикам и разработчицам приложения Playlist Maker",
                )
                putExtra(
                    Intent.EXTRA_TEXT,
                    "Спасибо разработчикам и разработчицам за крутое приложение!",
                )
            }
            startActivity(intent)
        }

        val buttonConditions = findViewById<ImageView>(R.id.conditions_button)

        buttonConditions.setOnClickListener {
            val url = Uri.parse("https://yandex.ru/legal/practicum_offer/")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }
    }
}
