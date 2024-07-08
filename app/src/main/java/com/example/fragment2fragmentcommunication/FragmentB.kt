package com.example.fragment2fragmentcommunication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout


class FragmentB : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_b, container, false)

        val message:String? = arguments?.getString("Data")
        message?.let {
            view.findViewById<TextView>(R.id.textView).text = message
        }
        val year:String? = arguments?.getString("year")
        arguments?.getString("year")?.let {
            view.findViewById<TextView>(R.id.textView).text = year
        }

        return view
    }

}