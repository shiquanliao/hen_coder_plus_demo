package com.stone.hen_coder_plus_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.stone.hen_coder_plus_demo.databinding.ActivityThreadChangeOnCreate2Binding
import com.stone.hen_coder_plus_demo.databinding.ActivityThreadChangeOnCreateDelayBinding
import kotlin.concurrent.thread

class ThreadChangeOnCreateDelay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityThreadChangeOnCreateDelayBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_thread_change_on_create_delay)

        thread {
            Thread.sleep(2000)
            binding.textView.text = "thread change text "

        }
    }
}