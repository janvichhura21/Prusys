package com.example.prusys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.example.prusys.activity.SignUpActivity
import com.example.prusys.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        setContentView(binding.root)
        binding.startBtn.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }
    }
}