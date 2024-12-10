package com.example.homework1.presenter

import com.example.homework1.CounterView
import com.example.homework1.data.dataSource.local.model.CounterModel

class CounterPresenter {
    private val model = CounterModel()
    private var view : CounterView? = null

    fun attachView(view: CounterView) {
        this.view = view
        view.showResult(model.getCount())
    }

    fun onIncrementClick() {
        model.increment()
        view?.showResult(model.getCount())
    }

    fun onDecrementClick() {
        model.decrement()
        view?.showResult(model.getCount())
    }

    fun getCounter() = model.getCount()

    fun detachView() {
        view = null
    }

    fun handleNumber(number: Int) {

    }
}