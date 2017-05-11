package com.example.macbookpro.lab3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class RectangleDrawView extends View {
    Paint paint = new Paint();

    public RectangleDrawView(Context context) {
        super(context);
        paint.setColor(0xffcb07f2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(15);

    }

    public RectangleDrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(0xffcb07f2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(15);
    }

    public RectangleDrawView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(0xffcb07f2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(15);
    }

    @Override
    public void onDraw(Canvas canvas) {

        canvas.drawRect(20, 20, 200, 100, paint);

    }

}
