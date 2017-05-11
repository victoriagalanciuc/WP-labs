package com.example.macbookpro.lab3;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {
    Button drawBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawBitmap = (Button) findViewById(R.id.drawBitmap);

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

    }

    public static Bitmap getBitmapByView(RelativeLayout view) {
        Bitmap bitmap = Bitmap.createBitmap(view.getWidth(),
                view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        view.draw(canvas);
        return bitmap;
    }
}
