package com.example.quis7dialogue

import android.content.Intent
import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = listOf("AlertDialogue","DatePickerDialogue","TimePickerDialogue")
        ini_list.adapter = ArrayAdapter(this, simple_list_item_1, data)

        ini_list.setOnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                intent = Intent(this, AlertDialogue::class.java)
                startActivity(intent)
            }
            if (position == 1) {
                intent = Intent(this, DatePickerDialogue::class.java)
                startActivity(intent)
            }
            if (position == 2) {
                intent = Intent(this, TimePickerDialogue::class.java)
                startActivity(intent)
            }
        }
    }
}