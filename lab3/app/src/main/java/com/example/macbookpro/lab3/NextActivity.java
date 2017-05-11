package com.example.macbookpro.lab3;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.RelativeLayout;

public class NextActivity extends AppCompatActivity {
    Button drawBitmap;
    Button showKeyboard;
    public static RadialGradient gradient;
    public static RadialGradient gradient2;
    CircleDrawViewGradient circle;
    RectangleDrawViewGradient rectangle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        drawBitmap = (Button) findViewById(R.id.drawBitmap);
        showKeyboard = (Button) findViewById(R.id.showKeyboard);
        circle = (CircleDrawViewGradient) findViewById(R.id.circle);
        rectangle = (RectangleDrawViewGradient) findViewById(R.id.rectangle);

        drawBitmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getBitmapByView((RelativeLayout) findViewById(R.id.secondView));
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        NextActivity.this);
                builder.setMessage("Bitmap was drawn")
                        .setTitle("Yay!")
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        showKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager inputMethodManager=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
            }
        });


    }

    public static Bitmap getBitmapByView(RelativeLayout view) {
        Bitmap bitmap = Bitmap.createBitmap(view.getWidth(),
                view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        view.draw(canvas);
        return bitmap;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_C:
                gradient = new RadialGradient(0, 0, 50, 0xffffccf3, 0xfff94065, Shader.TileMode.MIRROR);
                circle.invalidate();
                break;
            case KeyEvent.KEYCODE_R:
                gradient2 = new RadialGradient(0, 0, 100, 0xffeace, 0xfff99004, Shader.TileMode.MIRROR);
                rectangle.invalidate();
        }
        return true;
    }
}

