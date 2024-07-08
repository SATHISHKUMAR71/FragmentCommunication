package com.example.fragment2fragmentcommunication

import com.google.android.material.textfield.TextInputLayout

interface Communicator {

    fun sendData(editText: TextInputLayout)
}