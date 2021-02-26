package com.dmitry.pisarevskiy.kotlin07_hw_1.mvp.presenter

import com.dmitry.pisarevskiy.kotlin07_hw_1.mvp.model.MainModel
import com.dmitry.pisarevskiy.kotlin07_hw_1.mvp.view.MainView

class MainPresenter(private val view: MainView) {
    private val model: MainModel = MainModel

    fun counterOneClick() {
        view.counterOneSetText(model.incCounter(0).toString())
    }

    fun counterTwoClick() {
        view.counterTwoSetText(model.incCounter(1).toString())
    }

    fun counterThreeClick() {
        view.counterThreeSetText(model.incCounter(2).toString())
    }

    fun getCounterOne(): Int = model.getCounter(0)
    fun getCounterTwo(): Int = model.getCounter(1)
    fun getCounterThree(): Int = model.getCounter(2)
}