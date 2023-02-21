package com.example.kertasbatugunting.landingpage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kertasbatugunting.databinding.FragmentLandingPageTreeeBinding
import com.example.kertasbatugunting.Home


class LandingPageTreeFragmen : Fragment() {
    private var _binding : FragmentLandingPageTreeeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLandingPageTreeeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnStartGame.setOnClickListener{
            val intent = Intent(getActivity(), Home::class.java)
            startActivity(intent)
        }
    }
}