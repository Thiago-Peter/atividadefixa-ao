package com.example.streamflix;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private final int[] movies = { R.drawable.movie1, R.drawable.movie2, R.drawable.movie3 };

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarLista();
    }

    private void inicializarLista() {
        recyclerView = findViewById(R.id.recyclerMovies);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new MovieAdapter(this, movies));
    }
}
