package com.example.androideval2ex1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androideval2ex1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.twitter.setOnClickListener{
            val intent = Intent(this,TwitterLogin::class.java)
            startActivity(intent)
        }
        binding.facebook.setOnClickListener{
            val intent = Intent(this,FacebookLogin::class.java)
            startActivity(intent)

        }
        binding.bloggies.setOnClickListener {
            val intent = Intent(this,BloggiesCreate::class.java)
            startActivity(intent)

        }
    }
}