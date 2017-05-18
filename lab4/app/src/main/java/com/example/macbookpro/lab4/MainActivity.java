package com.example.macbookpro.lab4;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    SquareDrawView square1;
    SquareDrawView square2;
    RectangleDrawView rectangle;
    CircleDrawView circle1;
    CircleDrawView circle2;
    Timer t;
    int screenWidth;
    int screenHeight;
    int speedOfAnimation = 1000;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        square1 = (SquareDrawView) findViewById(R.id.square1);
        square2 = (SquareDrawView) findViewById(R.id.square2);
        rectangle = (RectangleDrawView) findViewById(R.id.rectangle);
        circle1 = (CircleDrawView) findViewById(R.id.circle1);
        circle2 = (CircleDrawView) findViewById(R.id.circle2);

        t = new java.util.Timer();


        final Display screen = getWindowManager().getDefaultDisplay();
        Point screenDimnension = new Point();
        screen.getSize(screenDimnension);
        screenWidth = screenDimnension.x;
        screenHeight = screenDimnension.y;

        new java.util.Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        t.scheduleAtFixedRate(new TimerTask() {
                            @Override
                            public void run() {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Random random = new Random();

                                        for (int i = 0; i < 5; i++) {

                                            int x = random.nextInt(screenWidth - 400);
                                            int y = random.nextInt(screenHeight - 400);

                                            switch (i){
                                                case 0:
                                                    square1.animate().x(x).setDuration(speedOfAnimation);
                                                    square1.animate().y(y).setDuration(speedOfAnimation);
                                                    break;
                                                case 1:
                                                    square2.animate().x(x).setDuration(speedOfAnimation);
                                                    square2.animate().y(y).setDuration(speedOfAnimation);
                                                    break;
                                                case 2:
                                                    rectangle.animate().x(x).setDuration(speedOfAnimation);
                                                    rectangle.animate().y(y).setDuration(speedOfAnimation);
                                                    break;
                                                case 3:
                                                    circle1.animate().x(x).setDuration(speedOfAnimation);
                                                    circle1.animate().y(y).setDuration(speedOfAnimation);
                                                    break;
                                                case 4:
                                                    circle2.animate().x(x).setDuration(speedOfAnimation);
                                                    circle2.animate().y(y).setDuration(speedOfAnimation);
                                                    break;
                                            }
                                        }
                                    }
                                });
                            }
                        }, 0, speedOfAnimation+50);
                    }
                });
            }
        }, 100);

    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_VOLUME_UP:

                speedOfAnimation += 100;

                t.cancel();
                t = new java.util.Timer();

                t.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Random random = new Random();

                                for (int i = 0; i < 5; i++) {

                                    int x = random.nextInt(screenWidth - 400);
                                    int y = random.nextInt(screenHeight - 400);

                                    switch (i){
                                        case 0:
                                            square1.animate().x(x).setDuration(speedOfAnimation);
                                            square1.animate().y(y).setDuration(speedOfAnimation);
                                            break;
                                        case 1:
                                            square2.animate().x(x).setDuration(speedOfAnimation);
                                            square2.animate().y(y).setDuration(speedOfAnimation);
                                            break;
                                        case 2:
                                            rectangle.animate().x(x).setDuration(speedOfAnimation);
                                            rectangle.animate().y(y).setDuration(speedOfAnimation);
                                            break;
                                        case 3:
                                            circle1.animate().x(x).setDuration(speedOfAnimation);
                                            circle1.animate().y(y).setDuration(speedOfAnimation);
                                            break;
                                        case 4:
                                            circle2.animate().x(x).setDuration(speedOfAnimation);
                                            circle2.animate().y(y).setDuration(speedOfAnimation);
                                            break;
                                    }
                                }
                            }
                        });
                    }
                }, 0, speedOfAnimation+50);


                break;
            case KeyEvent.KEYCODE_VOLUME_DOWN:

                speedOfAnimation -= 100;
                t.cancel();

                t = new java.util.Timer();

                t.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Random random = new Random();

                                for (int i = 0; i < 5; i++) {

                                    int x = random.nextInt(screenWidth - 400);
                                    int y = random.nextInt(screenHeight - 400);

                                    switch (i){
                                        case 0:
                                            square1.animate().x(x).setDuration(speedOfAnimation);
                                            square1.animate().y(y).setDuration(speedOfAnimation);
                                            break;
                                        case 1:
                                            square2.animate().x(x).setDuration(speedOfAnimation);
                                            square2.animate().y(y).setDuration(speedOfAnimation);
                                            break;
                                        case 2:
                                            rectangle.animate().x(x).setDuration(speedOfAnimation);
                                            rectangle.animate().y(y).setDuration(speedOfAnimation);
                                            break;
                                        case 3:
                                            circle1.animate().x(x).setDuration(speedOfAnimation);
                                            circle1.animate().y(y).setDuration(speedOfAnimation);
                                            break;
                                        case 4:
                                            circle2.animate().x(x).setDuration(speedOfAnimation);
                                            circle2.animate().y(y).setDuration(speedOfAnimation);
                                            break;
                                    }
                                }
                            }
                        });
                    }
                }, 0, speedOfAnimation+50);

                break;
        }
        return true;
    }
}
