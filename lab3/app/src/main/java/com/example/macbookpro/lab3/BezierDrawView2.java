package com.example.macbookpro.lab3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class BezierDrawView2 extends View {
    Paint paint = new Paint() {
        {
            setStyle(Style.STROKE);
            setStrokeCap(Cap.ROUND);
            setStrokeWidth(3.0f);
            setAntiAlias(true);
        }
    };

    final Path path = new Path();

    public BezierDrawView2(Context context) {
        super(context);
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(15);
    }

    public BezierDrawView2(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(15);
    }

    public BezierDrawView2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(15);
    }

    @Override
    public void onDraw(Canvas canvas) {
        path.moveTo(100, 100);

        path.cubicTo(100, 200, 30, 75, 0, 0);
        canvas.drawPath(path, paint);
    }

}
