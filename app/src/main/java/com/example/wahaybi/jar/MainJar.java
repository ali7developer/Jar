package com.example.wahaybi.jar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainJar extends AppCompatActivity {

    private ImageView btn_build;
    private ImageView btn_farm;
    private Button btn_have;
    private Button btn_con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_jar);
        btn_build =  findViewById(R.id.image1);
        btn_farm = findViewById(R.id.image2);
        btn_have=findViewById(R.id.btn);
        btn_con =findViewById(R.id.contact);


        btn_build.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainJar.this, ToolListActivity.class));
            }
        });



        btn_farm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainJar.this, ToolListActivity.class));
            }
        });

        btn_have.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainJar.this, MainActivity.class));
            }
        });


        btn_con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainJar.this, Contcat.class));
            }
        });



    }
}


