package com.example.homework1

import android.content.Context
import android.view.View
import android.widget.Toast
import com.example.homework1.data.dataSource.local.model.Action

class ShowToastAction(private val context: Context) : Action {
    override fun execute(view: View) {
        Toast.makeText(context, "Поздравляем!", Toast.LENGTH_SHORT).show()
    }
}