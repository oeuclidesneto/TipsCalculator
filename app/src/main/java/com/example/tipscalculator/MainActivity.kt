package com.example.tipscalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tipscalculator.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rbOptionOne.setOnCheckedChangeListener { _, isChecked ->
            println("Euclides1 Option one:$isChecked" )
        }

        binding.rbOptionTwo.setOnCheckedChangeListener { _, isChecked ->
            println("Euclides1 Option two:$isChecked" )
        }

        binding.rbOptionThree.setOnCheckedChangeListener { _, isChecked ->
            println("Euclides1 Option three:$isChecked" )
        }

        binding.btnClear.setOnClickListener {

        }
    }
}