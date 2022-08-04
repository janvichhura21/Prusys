package com.example.prusys.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.prusys.CategoryFragment
import com.example.prusys.R
import com.example.prusys.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_detail)
        setContentView(binding.root)
    // replaceFragment(R.id.frame,CategoryFragment())
     //  val title_name=intent.getStringExtra("name")
    //   binding.title.text=title_name
    }
}