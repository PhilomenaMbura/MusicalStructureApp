package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class ListSong extends AppCompatActivity {

    String[] artist = {"Lucky Dube", "Bob Marley", "Mighty Culture"};
    String[] song = {"Remember Me", "One Love", "Jah Love"};

    Integer[] images = {R.drawable.artist, R.drawable.album, R.drawable.play};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(R.string.list));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_list_song);


        Button albumButton = findViewById(R.id.button_album);
        Button mainButton = findViewById(R.id.button_main);
        Button artistButton = findViewById(R.id.button_artist);

        //Navigate to album activity
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(ListSong.this, Album.class);
                startActivity(v);
            }
        });

        //Navigate to main activity
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(ListSong.this, MainActivity.class);
                startActivity(v);
            }
        });


        //Navigate to artist activity
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(ListSong.this, Artist.class);
                startActivity(v);
            }
        });

        ListView listView = findViewById(R.id.listsong);

        MyListAdapter adapter = new MyListAdapter(this, artist, song, images);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer c = MediaPlayer.create(ListSong.this, R.raw.jonroselytrapped);
                c.start();
            }
        });


    }
}




