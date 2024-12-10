package com.example.homework1.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework1.presenter.CounterPresenter
import com.example.homework1.CounterView
import com.example.homework1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val presenter = CounterPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        presenter.attachView(this)

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

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}
