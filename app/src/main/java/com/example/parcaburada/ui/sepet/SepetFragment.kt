package com.example.parcaburada.ui.sepet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import com.example.parcaburada.R
class SepetFragment : Fragment() {

    private lateinit var sepetViewModel: SepetViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sepetViewModel =
            ViewModelProviders.of(this).get(sepetViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sepet, container, false)
        val textView: TextView = root.findViewById(R.id.text_sepet)
        sepetViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}