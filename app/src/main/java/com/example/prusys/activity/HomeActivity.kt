package com.example.prusys.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.prusys.R
import com.example.prusys.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_home)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_home)
        setContentView(binding.root)
        val navController= Navigation.findNavController(this,R.id.fragment)
        NavigationUI.setupWithNavController(binding.bottomNav,navController)
    }

}