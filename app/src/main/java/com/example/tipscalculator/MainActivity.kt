package com.example.tipscalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tipscalculator.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var percentage: Int = 0
        var numOfPeopleSelected = 0

            binding.btnCalculate.setOnClickListener {
                        val totalTableTemp = binding.tieTotal.text

                        if (totalTableTemp?.isEmpty() == true
                        ) {
                            Snackbar
                                .make(
                                    binding.tieTotal,
                                    "Fill out all the fields",
                                    Snackbar.LENGTH_LONG
                                )
                                .show()
                        } else {
                            val totalTable: Float = totalTableTemp.toString().toFloat()
                            val nPeople: Int = numOfPeopleSelected
                            val totalTemp = totalTable / nPeople
                            val tips = totalTemp * percentage / 100
                            val totalWithTips = totalTemp + tips

                            val intent = Intent(this, SummaryActivity::class.java)
                            intent.apply {
                                putExtra("totalTable", totalTable)
                                putExtra("numPeople", numOfPeopleSelected)
                                putExtra("percentage", percentage)
                                putExtra("totalAmount", totalWithTips)
                            }
                            clean()
                            startActivity(intent)
                        }
                        binding.btnClear.setOnClickListener {
                            clean ()

                        }
                    }
                }

    private fun clean (){
        binding.tieTotal.setText("")
    }
}