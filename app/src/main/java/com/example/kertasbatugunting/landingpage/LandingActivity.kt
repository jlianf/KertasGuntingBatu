package com.example.kertasbatugunting.landingpage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kertasbatugunting.databinding.ActivityLandingBinding

class LandingActivity: AppCompatActivity() {
    private val binding : ActivityLandingBinding by lazy{
        ActivityLandingBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val landingFragmentOne = LandingPageOneFragmen()
        val landingPageAdapter = LandingPagerAdapter(
            fragmentManager = supportFragmentManager,
            landingFragmentOne
        )
        binding.vpLanding.adapter = landingPageAdapter

    }
}