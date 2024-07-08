package com.example.fragment2fragmentcommunication

import android.app.Activity
import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import java.util.Calendar


class DatePickerFragment : DialogFragment(),DatePickerDialog.OnDateSetListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_date_picker, container, false)
    }
    private lateinit var communicator:DateSelectionListener
    private var calendar = Calendar.getInstance()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        return DatePickerDialog(requireActivity(),this,year,month,day)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        communicator = activity as DateSelectionListener
    }
    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {

        communicator.onDateSelected(p1,p2,p3)

    }

}