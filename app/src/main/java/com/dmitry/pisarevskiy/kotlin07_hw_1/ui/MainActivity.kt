package com.dmitry.pisarevskiy.kotlin07_hw_1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dmitry.pisarevskiy.kotlin07_hw_1.databinding.ActivityMainBinding
import com.dmitry.pisarevskiy.kotlin07_hw_1.mvp.presenter.MainPresenter
import com.dmitry.pisarevskiy.kotlin07_hw_1.mvp.view.MainView

class MainActivity : AppCompatActivity(), MainView {

    private val ui:ActivityMainBinding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    private val presenter:MainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ui.root)
        ui.btn1.text  = presenter.getCounterOne().toString()
        ui.btn2.text  = presenter.getCounterTwo().toString()
        ui.btn3.text  = presenter.getCounterThree().toString()
        ui.btn1.setOnClickListener{presenter.counterOneClick()}
        ui.btn2.setOnClickListener{presenter.counterTwoClick()}
        ui.btn3.setOnClickListener{presenter.counterThreeClick()}
    }

    override fun counterOneSetText(string: String) {
        ui.btn1.text = string
    }

    override fun counterTwoSetText(string: String) {
        ui.btn2.text = string
    }

    override fun counterThreeSetText(string: String) {
        ui.btn3.text = string
    }
}

