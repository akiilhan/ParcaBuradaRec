package com.example.parcaburada.ui.sepet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SepetViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is sepet Fragment"
    }
    val text: LiveData<String> = _text
}