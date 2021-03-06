package com.sanjaydevtech.sample.multipageapp.nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sanjaydevtech.sample.multipageapp.R

/**
 * First page for Navigation Component demo
 */
class NavFirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_nav_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.navigateBtn).setOnClickListener {
            val action =
                NavFirstFragmentDirections.actionNavFirstFragmentToNavSecondFragment("Hello world")
            findNavController().navigate(action)
        }
    }
}