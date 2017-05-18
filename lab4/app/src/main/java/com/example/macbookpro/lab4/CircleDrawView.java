package com.example.macbookpro.lab4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CircleDrawView extends View {
    Paint paint = new Paint();

    public CircleDrawView(Context context) {
        super(context);
        paint.setColor(0xff82ff3a);
    }

    public CircleDrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(0xff82ff3a);
    }

    public CircleDrawView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(0xff82ff3a);
    }


    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(100, 100, 75, paint);
    }

}
