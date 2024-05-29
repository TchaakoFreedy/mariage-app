package com.example.mariagepie;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Retrieve attributes passed as parameters
        String type = getIntent().getStringExtra("type");
        String description = getIntent().getStringExtra("description");
        String name = getIntent().getStringExtra("name");

        // Now you can use these attributes as needed, for example, set them to TextViews
        TextView typeTextView = findViewById(R.id.type);
        TextView descriptionTextView = findViewById(R.id.description);
        TextView nameTextView = findViewById(R.id.name);

        typeTextView.setText(type);
        descriptionTextView.setText(description);
        nameTextView.setText(name);
    }
}
