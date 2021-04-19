package com.example.quis7dialogue

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class DatePickerDialogue : AppCompatActivity() {
    lateinit var textView:TextView
    var year:Int = 0
    var month:Int = 0
    var day:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker_dialogue)
    }
    fun ButtonOnClicked(view: View){
        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener {
                view, year, monthOfYear, dayOfMonth ->
            textView.setText("" + dayOfMonth + " " + month + ", " + year)
        }, year, month, day)
        dpd.show()
    }
}