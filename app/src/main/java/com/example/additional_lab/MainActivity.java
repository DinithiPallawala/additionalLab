package com.example.additional_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer player = MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
        player.setLooping(true);
        player.start();
    }
    btnStart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startService(new Intent(MainActivity.this, MyServices.class));
        }
    });
    btnStop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            stopService(new Intent(MainActivity.this, MyServices.class));
        }
    });

}