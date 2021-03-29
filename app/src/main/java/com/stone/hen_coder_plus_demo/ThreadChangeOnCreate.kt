package com.stone.hen_coder_plus_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.databinding.DataBindingUtil
import com.stone.hen_coder_plus_demo.databinding.ActivityThreadChangeOnCreate2Binding
import kotlin.concurrent.thread

class ThreadChangeOnCreate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityThreadChangeOnCreate2Binding =
            DataBindingUtil.setContentView(this, R.layout.activity_thread_change_on_create2)

        binding.button2.setOnClickListener { view ->
            Log.e("stone", "onclick: ")
        }

        binding.button2.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    Log.e("stone", "ACTION_DOWN: ")
                    return@setOnTouchListener false
                }
                MotionEvent.ACTION_UP -> Log.e("stone", "ACTION_UP: ")
                MotionEvent.ACTION_MOVE -> Log.e("stone", "ACTION_MOVE: ")
                else -> {
                }
            }
            return@setOnTouchListener true
        }


        thread {
            binding.textView.text = "thread change text "

        }
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return true
    }
}