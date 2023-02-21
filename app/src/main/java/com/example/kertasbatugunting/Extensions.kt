package com.example.kertasbatugunting

import android.content.Context
import android.content.Intent

class Extensions {

    fun Context.intentTo(clazz: Class<*>, beforeStart : (Intent) -> Unit) {
        val intent = Intent(this, clazz)
        beforeStart.invoke(intent)
        startActivity(intent)
    }
}