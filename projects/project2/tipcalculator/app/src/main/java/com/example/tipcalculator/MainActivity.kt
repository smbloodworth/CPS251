package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tipcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tipCalcButton.setOnClickListener {
            if(binding.tipCalcInputBox.text.isNotEmpty()){
                val billAmount = binding.tipCalcInputBox.text.toString().toFloat()
                val billPlus10 = (billAmount + (billAmount*.10f))
                val billPlus15 = (billAmount + (billAmount*.15f))
                val billPlus20 = (billAmount + (billAmount*.20f))
                binding.tipCalcText.text = getString(R.string.the_tips_are_as_follows)+getString(R.string.new_line_character)+
                        getString(R.string.new_line_character)+getString(R.string.ten_percent)+ billPlus10.toString() +
                        getString(R.string.new_line_character) + getString(R.string.fifteen_percent) + billPlus15.toString() +
                        getString(R.string.new_line_character) + getString(R.string.twenty_percent) + billPlus20.toString()
            } else {
                binding.tipCalcText.text = getString(R.string.you_must_enter_a_bill_amount)
            }
        }
    }
}