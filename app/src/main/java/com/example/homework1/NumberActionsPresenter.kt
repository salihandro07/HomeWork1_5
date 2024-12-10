package com.example.homework1

import com.example.homework1.data.dataSource.local.model.NumberActionsModel

class NumberActionsPresenter(
    private val model: NumberActionsModel,
    private val view: NumberActionsView
) {

    fun handleNumber(number: Int) {
        when (number) {
            10 -> view.showToast("Поздравляем!")
            15 -> view.changeTextColorToGreen()  // Вызов метода, который будет менять цвет текста
        }
    }
}