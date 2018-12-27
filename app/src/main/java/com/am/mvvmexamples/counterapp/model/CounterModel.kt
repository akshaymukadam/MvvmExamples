package com.am.mvvmexamples.counterapp.model

class CounterModel {

    private var currentCounter: Int = 0

    fun incrementCounter() {
        currentCounter += 1
    }

    fun decrementCounter() {
        if (currentCounter == 0)
            return
        currentCounter -= 1
    }

    fun getCounterValue() = Counter(currentCounter)
}