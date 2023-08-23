package com.example.e_hatch.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.e_hatch.databinding.FragmentHomefragmentBinding


class Homefragment : Fragment() {
 lateinit var binding: FragmentHomefragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentHomefragmentBinding.inflate(inflater,container,false)

        return binding.root
    }


}