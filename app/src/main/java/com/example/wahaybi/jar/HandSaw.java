package com.example.wahaybi.jar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class HandSaw extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_layout);

        ImageView toolImageView = findViewById(R.id.tool_image_view);
        toolImageView.setImageResource(R.drawable.handsaw);

        TextView toolName = findViewById(R.id.tool_name);
        toolName.setText("Tool name: Hand Saw");

        TextView toolLocation = findViewById(R.id.tool_location);
        toolLocation.setText("Location: Al Batina");

        TextView toolPrice = findViewById(R.id.tool_price);
        toolPrice.setText("Price: 0.500 OMR");

        TextView toolOwnerName = findViewById(R.id.tool_Owner_name);
        toolOwnerName.setText("Owner: Monther");

        TextView phoneNumber = findViewById(R.id.owner_phone_number);
        phoneNumber.setText("Phone Number: 998674354");
    }
}
