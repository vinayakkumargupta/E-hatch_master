package com.example.e_hatch.Auth.PasswordSetup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.e_hatch.R
import com.example.e_hatch.databinding.FragmentSetpasswordBinding


class Setpassword : Fragment() {
    lateinit var binding: FragmentSetpasswordBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSetpasswordBinding.inflate(inflater,container,false)

        return binding.root
    }


}