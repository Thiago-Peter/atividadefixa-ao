package com.example.streamflix;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private final Context context;
    private final int[] movieImages;

    public MovieAdapter(Context context, int[] movieImages) {
        this.context = context;
        this.movieImages = movieImages;
    }

    @NonNull @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(view);
    }

    @Override public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.imgMovie.setImageResource(movieImages[position]);
    }

    @Override public int getItemCount() { return movieImages.length; }

    static class MovieViewHolder extends RecyclerView.ViewHolder {
        final ImageView imgMovie;
        MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMovie = itemView.findViewById(R.id.imgMovie);
        }
    }
}
