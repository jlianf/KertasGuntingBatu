package com.example.kertasbatugunting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kertasbatugunting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private fun starGame(option : String){
        val draw : String = getString(R.string.draw)
        val playerWin : String = getString(R.string.playerwin)
        val comWin : String = getString(R.string.comwin)
        val computerOption = Game.randomOption()

        when{
            Game.isDraw(option,computerOption)-> binding.tvResult.text = draw
            Game.isWin(option,computerOption)-> binding.tvResult.text = playerWin
            else -> binding.tvResult.text = comWin
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val reset : TextView = binding.tvResult

        binding.imPlayerBatu.setOnClickListener{starGame("ROCK") }
        binding.imPlayerGunting.setOnClickListener{starGame("SCISSORS")}
        binding.imPlayerKertas.setOnClickListener{starGame("PAPER")}
        binding.imReset.setOnClickListener { reset.setText("VS") }

    }
}