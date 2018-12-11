package com.example.wahaybi.jar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class screwDriver extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_layout);

        ImageView drillImageView = findViewById(R.id.tool_image_view);
        drillImageView.setImageResource(R.drawable.screwdriver);

        TextView toolName = findViewById(R.id.tool_name);
        toolName.setText("Tool name: Screw Driver");

        TextView drilLocation = findViewById(R.id.tool_location);
        drilLocation.setText("Location: Dhofar");

        TextView drillPrice = findViewById(R.id.tool_price);
        drillPrice.setText("Price: 0.200 OMR");

        TextView drillOwnerName = findViewById(R.id.tool_Owner_name);
        drillOwnerName.setText("Owner: Salim");

        TextView phoneNumber = findViewById(R.id.owner_phone_number);
        phoneNumber.setText("Phone Number: 9996354");
    }
}
