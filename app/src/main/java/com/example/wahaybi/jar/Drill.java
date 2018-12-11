package com.example.wahaybi.jar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Drill extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_layout);

        ImageView toolImageView = findViewById(R.id.tool_image_view);
        toolImageView.setImageResource(R.drawable.drill);

        TextView toolName = findViewById(R.id.tool_name);
        toolName.setText("Tool name: Drill Machine");

        TextView drilLocation = findViewById(R.id.tool_location);
        drilLocation.setText("Location: Muscat");

        TextView drillPrice = findViewById(R.id.tool_price);
        drillPrice.setText("Price: 2.00 OMR");

        TextView drillOwnerName = findViewById(R.id.tool_Owner_name);
        drillOwnerName.setText("Owner: Ahmed");

        TextView phoneNumber = findViewById(R.id.owner_phone_number);
        phoneNumber.setText("Phone Number: 9995554");

    }

}
