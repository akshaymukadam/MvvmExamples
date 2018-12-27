package com.am.mvvmexamples.counterapp.model

class CounterModel {

    private var currentCounter: Int = 0

    fun incrementCounter(): Counter {
        currentCounter += 1
        return Counter(currentCounter)
    }

    fun decrementCounter(): Counter {
        if (currentCounter == 0)
            return Counter(counterValue = 0)
        currentCounter -= 1
        return Counter(currentCounter)
    }
}