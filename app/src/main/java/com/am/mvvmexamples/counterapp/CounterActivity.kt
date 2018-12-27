package com.am.mvvmexamples.counterapp

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.am.mvvmexamples.R
import com.am.mvvmexamples.counterapp.viewmodel.CounterViewModel
import com.am.mvvmexamples.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityCounterBinding =
            DataBindingUtil.setContentView(this@CounterActivity, R.layout.activity_counter)
        binding.vm = CounterViewModel()
    }
}
