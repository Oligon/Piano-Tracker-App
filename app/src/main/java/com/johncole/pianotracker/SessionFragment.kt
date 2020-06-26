package com.johncole.pianotracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.johncole.pianotracker.databinding.FragmentSessionBinding

class SessionFragment : Fragment() {

    private lateinit var binding: FragmentSessionBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSessionBinding.inflate(inflater, container, false)
        return binding.root
    }
}