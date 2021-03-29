package com.stone.hen_coder_plus_demo.test

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup

class TouchLayout(context: Context?, attrs: AttributeSet?) : ViewGroup(context, attrs) {
    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        TODO("Not yet implemented")
    }

    override fun shouldDelayChildPressedState(): Boolean {
        return false
    }


}