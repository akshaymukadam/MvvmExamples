package com.am.mvvmexamples.counterapp.viewmodel

import android.databinding.BaseObservable
import com.am.mvvmexamples.counterapp.model.CounterModel

class CounterViewModel(val model: CounterModel = CounterModel()) : BaseObservable() {


    fun onClickIncrement() {

    }

    fun onClickDecrement() {

    }
}