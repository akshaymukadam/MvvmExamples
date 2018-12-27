package com.am.mvvmexamples.counterapp.model

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CounterModelTest {

    lateinit var counterModel: CounterModel

    @Before
    fun setUp() {
        counterModel = CounterModel()
    }

    @Test
    fun testShouldIncrementCounter() {
        for (i in 1..3) {
            Assert.assertEquals(i, counterModel.incrementCounter().counterValue)
        }
    }

    @Test
    fun testShouldDecrementCounter() {
        incrementCounter()
        for (i in 6 downTo 0) {
            Assert.assertEquals(i, counterModel.decrementCounter().counterValue)
        }
    }

    @Test
    fun testShouldNotDecrementCounter() {
        Assert.assertEquals(0, counterModel.decrementCounter().counterValue)
    }

    private fun incrementCounter() {
        for (i in 0..6) {
            counterModel.incrementCounter()
        }
    }
}
