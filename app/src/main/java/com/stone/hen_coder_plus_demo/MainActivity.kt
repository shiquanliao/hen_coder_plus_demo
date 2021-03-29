package com.stone.hen_coder_plus_demo

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.stone.hen_coder_plus_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        requestWindowFeature()
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        drawSubScript()

        val data = mutableListOf("在oncreate中使用", "在oncreate中延时使用")
        val myAdapter = MyAdapter(data)
        binding.recyclerView.adapter = myAdapter
        myAdapter.setNewInstance(data)

        myAdapter.setOnItemClickListener { adapter, view, position ->
            Log.e("stone", "onCreate: $position")
            when (position) {
                0 -> startActivity(Intent(this, ThreadChangeOnCreate::class.java))
                1 -> startActivity(Intent(this, ThreadChangeOnCreateDelay::class.java))
                else -> {
                }
            }
        }
    }

}