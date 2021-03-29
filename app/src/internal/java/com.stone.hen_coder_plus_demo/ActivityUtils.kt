package com.stone.hen_coder_plus_demo

import android.graphics.Color
import android.view.View
import android.view.ViewGroup


fun android.app.Activity.drawSubScript() {
    val badge = View(this)
    badge.setBackgroundColor(Color.parseColor("#F32103"))

    val decorView = window.decorView as ViewGroup
    decorView.addView(badge, 200, 200)
}