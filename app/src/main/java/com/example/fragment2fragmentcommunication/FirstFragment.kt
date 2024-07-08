package com.example.fragment2fragmentcommunication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale


class FirstFragment : Fragment(),DateSelectionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onDateSelected(year: Int, month: Int, day: Int) {
        val calendar = Calendar.getInstance().apply {
            set(Calendar.YEAR,year)
            set(Calendar.MONTH,month)
            set(Calendar.DAY_OF_MONTH,day)
        }
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        val selectionDate = dateFormat.format(calendar.time)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

}