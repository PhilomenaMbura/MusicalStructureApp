package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] artists;
    private final String[] song;
    private final Integer[] images;

    public MyListAdapter(Activity context, String[] artists, String[] song, Integer[] images) {
        super(context, R.layout.design, artists);
        // TODO Auto-generated constructor stub

        this.context = context;
        this.artists = artists;
        this.song = song;
        this.images = images;

    }

    public View getView(final int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.design, null, true);
        TextView artistsText = (TextView) rowView.findViewById(R.id.artists);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView songText = (TextView) rowView.findViewById(R.id.song3);

        artistsText.setText(artists[position]);
        imageView.setImageResource(images[position]);
        songText.setText(song[position]);

        return rowView;

    }

    ;
}
