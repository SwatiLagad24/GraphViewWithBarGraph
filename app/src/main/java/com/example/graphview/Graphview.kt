package com.example.graphview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet

class Graphview(
    context: Context,attributeSet: AttributeSet?=null
):androidx.appcompat.widget.AppCompatImageView(
    context,attributeSet
)
{
    var values:IntArray?=null

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        var paint=Paint()
        paint.setColor(Color.RED)
        var linePaint=Paint()
        linePaint.setColor(Color.WHITE)
        linePaint.strokeWidth=15F
        setPadding(0,0,15,0)

        var barwidth=width/values!!.size//it means we are divding width bye number of element we have
       //ie for 5 numbers
        var heightToPercent=height/100
        for (i in 0.. values!!.size-1)
        {
            canvas!!.drawRect(
                ( i *barwidth).toFloat()//top left corner

            ,height.toFloat()

              ,
                (i*barwidth)+barwidth.toFloat()//startingpoint for new column

                ,height-values!![i]*heightToPercent.toFloat()//bottom right
            ,paint
            )
            canvas.drawLine(

                ( i *barwidth)+barwidth.toFloat(),//x point
                height.toFloat(),//y point

                ( i *barwidth)+barwidth.toFloat(),//x
                height-values!![i]*heightToPercent.toFloat(),
                linePaint


            )
        }

    }
}
