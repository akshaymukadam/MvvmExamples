package com.am.mvvmexamples.counterapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.am.mvvmexamples.R

class CounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
    }
}
