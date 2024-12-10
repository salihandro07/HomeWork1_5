package com.example.homework1.data.dataSource.local.model


import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.TextView
import android.widget.Toast

// Реализация действия для отображения Toast
class ShowToastAction(private val context: Context) : Action {
    override fun execute(view: View) {
        Toast.makeText(context, "Поздравляем!", Toast.LENGTH_SHORT).show()
    }
}

// Реализация действия для изменения цвета текста
class ChangeTextColorAction : Action {
    override fun execute(view: View) {
        if (view is TextView) {
            view.setTextColor(Color.GREEN)
        }
    }
}