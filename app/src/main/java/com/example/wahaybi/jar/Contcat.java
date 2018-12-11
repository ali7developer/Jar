package com.example.wahaybi.jar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Contcat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contcat);

        ImageView contactImage = findViewById(R.id.contact_image);
        contactImage.setImageResource(R.drawable.cantact_us02);
    }
}
