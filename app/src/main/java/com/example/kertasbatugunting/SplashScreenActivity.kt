package com.example.kertasbatugunting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.bumptech.glide.Glide
import com.example.kertasbatugunting.databinding.ActivitySplashScreenBinding
import com.example.kertasbatugunting.landingpage.LandingActivity

class SplashScreenActivity : AppCompatActivity() {
    private val binding : ActivitySplashScreenBinding by lazy{
        ActivitySplashScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val url = "https://i.ibb.co/HC5ZPgD/splash-screen1.png"
        Glide.with(this)
            .load(url)
            .centerCrop()
            .into(binding.SplashScreenImage)

        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this, LandingActivity::class.java)
            startActivity(i)
        }, 3000)
    }
}