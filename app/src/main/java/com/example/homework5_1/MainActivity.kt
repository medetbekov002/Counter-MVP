package com.example.homework5_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework5_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View {
    lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            incrementBtn.setOnClickListener {
             presenter.increment()
            }
        }
    }

    override fun changeCount(count: Int) {
        binding.resultTv.text = count.toString()
    }
}