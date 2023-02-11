package com.example.kertasbatugunting

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.kertasbatugunting.databinding.PlayerVsPlayerBinding
import java.util.zip.Inflater

class PlayerVsPlayerActivity : AppCompatActivity() {
    private val binding : PlayerVsPlayerBinding by lazy {
        PlayerVsPlayerBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}