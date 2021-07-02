package com.example.androideval2ex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.androideval2ex1.databinding.ActivityTwitterLoginBinding

class TwitterLogin : AppCompatActivity() {
    private lateinit var binding : ActivityTwitterLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwitterLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // binding.buttontwitter.setOnClickListener {
         //   var login = binding.name.text
         //   if (!login.contains("@"))
       // }
}
}





