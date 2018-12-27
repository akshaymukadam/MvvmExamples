package com.am.mvvmexamples.counterapp.viewmodel

import android.databinding.BaseObservable
import com.am.mvvmexamples.counterapp.model.CounterModel

class CounterViewModel @JvmOverloads constructor(val model: CounterModel = CounterModel()) : BaseObservable() {


    val outputCounterValue: String
        get() = model.getCounterValue().counterValue.toString()

    fun onClickIncrement() {
        model.incrementCounter()
        notifyChange()
    }

    fun onClickDecrement() {
        model.decrementCounter()
        notifyChange()
    }
}