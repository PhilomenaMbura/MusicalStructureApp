package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Album extends AppCompatActivity {

    MediaPlayer player1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(getResources().getString(R.string.album));


        Button artistButton = findViewById(R.id.button_artist);
        Button mainButton = findViewById(R.id.button_main);
        Button listButton = findViewById(R.id.button_list);
        Button album2Button = findViewById(R.id.button_album2);

        //Navigate to artist activity
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(Album.this, Artist.class);
                startActivity(v);
            }
        });

        //Navigate to album activity
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(Album.this, MainActivity.class);
                startActivity(v);
            }
        });


        //Navigate to list activity
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(Album.this, ListSong.class);
                startActivity(v);
            }
        });

        //Navigate to album2 activity
        album2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(Album.this, AlbumActivity2.class);
                startActivity(v);
            }
        });

        //play song1
        final ImageView playsong1 = (ImageView) findViewById(R.id.playsong1);
        playsong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myplayer(R.raw.ericcarlsontunnelbirds);
                playsong1.setEnabled(false);
            }
        });
        //stop song1
        final ImageView stopsong1 = (ImageView) findViewById(R.id.stopsong1);
        stopsong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopmusic();
                playsong1.setEnabled(true);
            }
        });


        //play song2
        ImageView playsong2 = (ImageView) findViewById(R.id.playsong2);
        playsong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myplayer(R.raw.johnwesleycolemantequila);
                playsong1.setEnabled(false);
            }
        });

        //stop song2
        ImageView stopsong2 = (ImageView) findViewById(R.id.stopsong2);
        stopsong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopmusic();
                playsong1.setEnabled(true);
            }
        });


        //play song3
        ImageView playsong3 = (ImageView) findViewById(R.id.playsong3);
        playsong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myplayer(R.raw.jonroselytrapped);
                playsong1.setEnabled(false);
            }
        });

        //stop song3
        ImageView stopsong3 = (ImageView) findViewById(R.id.stopsong3);
        stopsong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopmusic();
                playsong1.setEnabled(true);
            }
        });


        //play song4
        ImageView playsong4 = (ImageView) findViewById(R.id.playsong4);
        playsong4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myplayer(R.raw.marcoraaphorstmafkees);
                playsong1.setEnabled(false);
            }
        });

        //stop song4
        ImageView stopsong4 = (ImageView) findViewById(R.id.stopsong4);
        stopsong4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopmusic();
                playsong1.setEnabled(true);
            }
        });


        //play song5
        ImageView playsong5 = (ImageView) findViewById(R.id.playsong5);
        playsong5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myplayer(R.raw.thebooksbuzz);
                playsong1.setEnabled(false);
            }
        });

        //stop song5
        ImageView stopsong5 = (ImageView) findViewById(R.id.stopsong5);
        stopsong5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopmusic();
                playsong1.setEnabled(true);
            }
        });

    }

    public void myplayer(int song) {

        player1 = MediaPlayer.create(Album.this, song);
        player1.start();
    }


    public void stopmusic() {
        player1.stop();
    }

}
