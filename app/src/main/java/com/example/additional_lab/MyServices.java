package com.example.additional_lab;

import android.media.MediaPlayer;
import android.provider.Settings;

public class MyServices extends Service {
    private MediaPlayer player;
    public int onStartCommand(Intent intent, int flags, int startId){
        player = MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
        player.setLooping(true);
        player.start();
        return START_STICKY;
    }
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
}

