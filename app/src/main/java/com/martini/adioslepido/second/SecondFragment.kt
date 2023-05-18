package com.martini.adioslepido.second

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.martini.adioslepido.R

class SecondFragment : Fragment(R.layout.second_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button?>(R.id.secondFragButton).apply {
            setOnClickListener(::goToThirdFragment)
        }

        view.findViewById<Button?>(R.id.secondFragPopButton).apply {
            setOnClickListener(::pop)
        }
    }

    private fun goToThirdFragment(view: View) {
        findNavController().navigate(R.id.thirdFragment)
    }

    private fun pop(view: View) {
        findNavController().popBackStack()
    }
}