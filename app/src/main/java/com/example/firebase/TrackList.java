package com.example.firebase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class TrackList extends ArrayAdapter<Track> {

    private Activity context;
    private List<Track> tracks;


    public TrackList(Activity context, List<Track> tracks){

        super(context, R.layout.activity_track_list, tracks);
        this.context = context;
        this.tracks = tracks;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_track_list,null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textviewName);
        TextView textViewRating = (TextView) listViewItem.findViewById(R.id.textviewRating);

        Track track = tracks.get(position);

        textViewName.setText(track.getTrackName());
        textViewRating.setText(String.valueOf(track.getTrackRating()));

        return listViewItem;
    }
}

