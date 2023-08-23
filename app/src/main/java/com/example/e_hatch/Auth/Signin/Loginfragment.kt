package com.example.e_hatch.Auth.Signin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.e_hatch.R
import com.example.e_hatch.databinding.FragmentForgetpassBinding
import com.example.e_hatch.databinding.FragmentLoginfragmentBinding


class loginfragment : Fragment() {
    lateinit var binding: FragmentLoginfragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginfragmentBinding.inflate(inflater, container, false)
        return binding.root
    }


}