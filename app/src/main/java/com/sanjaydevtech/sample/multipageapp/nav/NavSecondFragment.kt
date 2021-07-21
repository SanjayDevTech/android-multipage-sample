package com.sanjaydevtech.sample.multipageapp.nav

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.sanjaydevtech.sample.multipageapp.R

class NavSecondFragment : Fragment() {

    private val args: NavSecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_nav_second, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = args.data
        view.findViewById<TextView>(R.id.textView).text = "This is second activity\nwith data: $data"
        view.findViewById<Button>(R.id.finishBtn).setOnClickListener {
            findNavController().popBackStack()
        }
    }

}