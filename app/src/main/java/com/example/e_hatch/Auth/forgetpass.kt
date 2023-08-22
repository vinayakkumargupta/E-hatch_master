package com.example.e_hatch.Auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.e_hatch.R
import com.example.e_hatch.databinding.FragmentForgetpassBinding

class forgetpass : Fragment() {

    lateinit var binding: FragmentForgetpassBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentForgetpassBinding.inflate(inflater, container, false)
        return binding.root
    }

}