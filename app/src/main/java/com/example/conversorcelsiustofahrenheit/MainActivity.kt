package com.example.conversorcelsiustofahrenheit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversorcelsiustofahrenheit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convertBTN.setOnClickListener{
            val celsius = binding.editTextNumber.text.toString().toDoubleOrNull()
            if (celsius != null) {
                val fahrenheit = celsius * 9 / 5 + 32

                binding.fahrenheit.text = String.format("%.2f", fahrenheit)
            } else {
                binding.fahrenheit.text = "Invalid input"
            }
        }
    }
}