package com.example.alab.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void tw_0(View v) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.tw_0);
        mp.start();
    }

    public void tw_1(View v) {
        stopPlaying();
        mp = MediaPlayer.create(MainActivity.this, R.raw.tw_1);
        mp.start();
    }

    private void stopPlaying(){
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
