package com.example.appcarvalho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appcarvalho.databinding.ActivityAgendatesteBinding

class Agendateste : AppCompatActivity() {
    private lateinit var binding: ActivityAgendatesteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAgendatesteBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}