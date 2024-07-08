package com.example.fragment2fragmentcommunication

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.textfield.TextInputLayout

class FragmentA : Fragment() {

    private lateinit var communicator: Communicator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_a, container, false)

        communicator = activity as Communicator

        view.findViewById<Button>(R.id.button).setOnClickListener{
            communicator.sendData(view.findViewById<TextInputLayout?>(R.id.textInputLayout))
        }
        return view
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
    }
}