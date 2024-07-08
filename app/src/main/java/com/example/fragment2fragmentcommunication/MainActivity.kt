package com.example.fragment2fragmentcommunication

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity(),Communicator,DateSelectionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout,DatePickerFragment())
            .commit()
    }

    override fun sendData(editText: TextInputLayout) {
        val bundle = Bundle()
        bundle.putString("Data",editText.editText?.text.toString())
        val fragmentB = FragmentB()
        fragmentB.arguments = bundle
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout,fragmentB)
            .commit()
    }

    override fun onDateSelected(year: Int, month: Int, day: Int) {
        val bundle = Bundle()
        bundle.putInt("year",year)
        bundle.putInt("month",month)
        bundle.putInt("day",day)
        val fragmentB = FragmentB()
        fragmentB.arguments = bundle
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout,fragmentB)
            .commit()
    }
}