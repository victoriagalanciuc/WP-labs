package com.example.macbookpro.lab3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.util.AttributeSet;
import android.view.View;

import com.example.macbookpro.lab3.NextActivity;

public class RectangleDrawViewGradient extends View {
    Paint paint = new Paint();

    public RectangleDrawViewGradient(Context context) {
        super(context);
        paint.setColor(0xffffeace);
    }

    public RectangleDrawViewGradient(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(0xffffeace);
    }

    public RectangleDrawViewGradient(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(0xffffeace);
    }

    @Override
    public void onDraw(Canvas canvas) {
        RadialGradient gradient = NextActivity.gradient2;
        if(gradient != null)
            paint.setShader(gradient);
        canvas.drawRect(0, 0, 300, 300, paint);
    }
}
