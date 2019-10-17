package com.eramint.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setDarkMood(2)
        setContentView(R.layout.home_activity)
    }


    companion object {
        external fun API_KEY(): String

        init {
            System.loadLibrary("native-lib")
        }
    }

    private fun setDarkMood(value: Int) {
//        MODE_NIGHT_NO = 1
//        MODE_NIGHT_YES = 2;
        delegate.localNightMode = value
    }
}
