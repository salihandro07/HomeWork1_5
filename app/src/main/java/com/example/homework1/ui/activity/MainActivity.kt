package com.example.homework1.ui.activity

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.homework1.presenter.CounterPresenter
import com.example.homework1.CounterView
import com.example.homework1.NumberActionsView
import com.example.homework1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView, NumberActionsView {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val presenter = CounterPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        presenter.attachView(this)

        binding.btnIncrement.setOnClickListener {
            val number = 10 // Здесь можно изменить на любое другое число
            presenter.handleNumber(number)
        }

        binding.apply {
            btnDecrement.setOnClickListener {
                presenter.onDecrementClick()
                tvResult.text = presenter.getCounter().toString()
            }
            btnIncrement.setOnClickListener {
                presenter.onIncrementClick()
            }
        }
    }

    override fun showResult(count: Int) {
        binding.tvResult.text = count.toString()
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColorToGreen() {
        binding.tvResult.setTextColor(Color.GREEN)
    }
    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}
