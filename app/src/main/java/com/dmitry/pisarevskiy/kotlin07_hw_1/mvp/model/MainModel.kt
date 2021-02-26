package com.dmitry.pisarevskiy.kotlin07_hw_1.mvp.model

object MainModel {
    var counters = arrayOf(0, 0, 0)

    fun incCounter(numOfCounter: Int): Int = ++counters[numOfCounter]

    fun getCounter(numOfCounter: Int): Int = counters[numOfCounter]
}