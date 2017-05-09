package com.example.macbookpro.lab3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class BezierDrawView1 extends View {
    Paint paint = new Paint() {
        {
            setStyle(Style.STROKE);
            setStrokeCap(Cap.ROUND);
            setStrokeWidth(3.0f);
            setAntiAlias(true);
        }
    };

    final Path path = new Path();

    public BezierDrawView1(Context context) {
        super(context);
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(5);
    }

    public BezierDrawView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(5);
    }

    public BezierDrawView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(5);
    }

    @Override
    public void onDraw(Canvas canvas) {
        path.moveTo(0, 0);

        path.cubicTo(200, 200, 250, 50, 125, 125);
        canvas.drawPath(path, paint);
    }

}
