package com.example.android3lesson1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android3lesson1.View.CounterView
import com.example.android3lesson1.databinding.ActivityMainBinding
import com.example.android3lesson1.presenter.Presenter

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            incrementBtn.setOnClickListener{
               presenter.increment()
                if (presenter.changeColor()){
                    binding.counterTv.setTextColor(Color.parseColor("#FF03DAC5"))
                }
                presenter.toast(this@MainActivity)
            }
            decrementBtn.setOnClickListener{
                presenter.decrement()
                if (!presenter.changeColor()){
                    binding.counterTv.setTextColor(Color.parseColor("#FF000000"))
                }
            }
        }
    }

    override fun updateCount(count: String) {
        binding.counterTv.text = count
    }

}
