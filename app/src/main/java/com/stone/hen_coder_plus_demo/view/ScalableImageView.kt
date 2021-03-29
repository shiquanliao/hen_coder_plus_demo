package com.stone.hen_coder_plus_demo.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.stone.hen_coder_plus_demo.dp
import com.stone.hen_coder_plus_demo.getAvatar

class ScalableImageView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {


    private val bitmap = getAvatar(resources, 300.dp.toInt())
    private val paint = Paint()


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawBitmap(bitmap, 0f, 0f, paint)
    }
}