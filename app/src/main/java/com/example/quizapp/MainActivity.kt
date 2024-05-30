package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            if (binding.input.text.toString().isEmpty())
            {
                binding.input.setError("Enter YOUR Name !")
            }
            else
            {
                var intent=Intent(this,Questions::class.java)
                intent.putExtra("${setData.name}",binding.input.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}