package com.example.actividad2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int guide = getResources().getConfiguration().orientation;
        if (guide == Configuration.ORIENTATION_LANDSCAPE)
        {
            getSupportActionBar().hide();
        }
        else
        {
            getSupportActionBar().show();
        }


        videoView.findViewById(R.id.videoView);

        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videofondo));
        MediaController mc = new MediaController(this);

        videoView.setMediaController(mc);
        mc.setAnchorView(videoView);

        videoView.start();
    }
}