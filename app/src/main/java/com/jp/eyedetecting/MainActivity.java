package com.jp.eyedetecting;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

import java.net.HttpCookie;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    LookAtMe lookAtMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        lookAtMe = findViewById(R.id.lookme);

        lookAtMe.init(this);
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));
       // lookAtMe.setVideoPath("https://youtube.com/shorts/lHNHDhSUKo4?si=PFmFOEYO_u7pO5gr");

        lookAtMe.start();
       // lookAtMe.setLookMe();;
    }
}