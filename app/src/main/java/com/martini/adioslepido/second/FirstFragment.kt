package com.martini.adioslepido.second

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.martini.adioslepido.R

class FirstFragment : Fragment(R.layout.first_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button?>(R.id.firstFragButton).apply {
            setOnClickListener(::goToSecondFragment)
        }
    }

    private fun goToSecondFragment(view: View) {
        findNavController().navigate(R.id.secondFragment)
    }
}