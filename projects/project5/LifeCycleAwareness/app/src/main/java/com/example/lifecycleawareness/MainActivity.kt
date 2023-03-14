package com.example.lifecycleawareness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lifecycleawareness.ui.main.MainFragment
import com.example.lifecycleawareness.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}