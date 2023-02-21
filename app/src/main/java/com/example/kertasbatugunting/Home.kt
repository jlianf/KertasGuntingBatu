package com.example.kertasbatugunting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kertasbatugunting.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private val binding : ActivityHomeBinding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}