package com.martini.adioslepido.second

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.martini.adioslepido.R

class ThirdFragment : Fragment(R.layout.third_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button?>(R.id.thirdFragButton).apply {
            setOnClickListener(::popToFirstScreen)
        }

        view.findViewById<Button?>(R.id.thirdFragPopButton).apply {
            setOnClickListener(::pop)
        }
    }

    private fun popToFirstScreen(view: View) {
        activity?.finish()
    }

    private fun pop(view: View) {
        findNavController().popBackStack()
    }
}