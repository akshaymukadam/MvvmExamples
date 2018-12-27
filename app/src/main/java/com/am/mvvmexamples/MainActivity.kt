package com.am.mvvmexamples

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.am.mvvmexamples.counterapp.CounterActivity
import com.am.mvvmexamples.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        binding.vm = User("James")
        btnCounter.setOnClickListener { startActivity(Intent(this@MainActivity, CounterActivity::class.java)) }
    }
}
