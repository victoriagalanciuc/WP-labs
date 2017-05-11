package com.example.macbookpro.lab3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.util.AttributeSet;
import android.view.View;


import com.example.macbookpro.lab3.NextActivity;

public class CircleDrawViewGradient extends View {
    Paint paint = new Paint();
    public RadialGradient gradient = NextActivity.gradient;

    public CircleDrawViewGradient(Context context) {
        super(context);
        paint.setColor(Color.MAGENTA);

    }

    public CircleDrawViewGradient(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(Color.MAGENTA);

    }

    public CircleDrawViewGradient(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(Color.MAGENTA);

    }

    @Override
    public void onDraw(Canvas canvas) {

        RadialGradient gradient = NextActivity.gradient;
        if(gradient != null)
            paint.setShader(gradient);
        canvas.drawCircle(100, 100, 100, paint);
    }

}
