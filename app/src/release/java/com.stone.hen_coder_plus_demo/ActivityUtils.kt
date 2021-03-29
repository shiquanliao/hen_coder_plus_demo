package com.stone.hen_coder_plus_demo


fun android.app.Activity.drawSubScript() {
    val badge = View(this)
    badge.setBackgroundColor(Color.parseColor("#F3B4A2"))

    val decorView = window.decorView as ViewGroup
    decorView.addView(badge, 200, 200)
}