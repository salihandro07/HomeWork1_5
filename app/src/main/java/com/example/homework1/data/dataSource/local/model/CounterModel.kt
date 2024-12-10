package com.example.homework1.data.dataSource.local.model

class CounterModel {

    private var count = 0

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }

    fun getCount() = count
}