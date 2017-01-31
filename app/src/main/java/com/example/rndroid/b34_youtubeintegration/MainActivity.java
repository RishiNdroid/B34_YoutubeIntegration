package com.example.rndroid.b34_youtubeintegration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeIntents;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

// INSTED OF APPCOMPACTACTIVITY :- extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener
public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    YouTubePlayerView youTubeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize the view
        youTubeView = (YouTubePlayerView) findViewById(R.id.youtubeView);
        //INITIALIZE YOUTUBEPLAYERVIEW WITH GOOGLE API-KEY
        youTubeView.initialize("AIzaSyAajExPpw8RySaoD7Eq1fpT1Jd2huwFAwQ", this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        //NOW YOU CAN PLAY ANY VIDEO HERE

        youTubePlayer.cueVideo("fOWaJi1Hsfo");
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
    }
}