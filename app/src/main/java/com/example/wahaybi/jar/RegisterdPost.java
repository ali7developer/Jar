package com.example.wahaybi.jar;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterdPost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerd_post);



        LinearLayout rootView = findViewById(R.id.rootView);
        TextView textR = new TextView(this);
        textR.setText(MainActivity.textP);
        textR.setTextSize(24);
        rootView.addView(textR);

        Button postButton = new Button(this);
        postButton.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        postButton.setText("Post");
        postButton.setBackgroundColor(getResources().getColor(R.color.g));



        rootView.addView(postButton);
        //RegisterdPost post = new RegisterdPost();
        //Toast toast = new Toast(this);



        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(getApplicationContext(), "Your Post Has Been Registerd!", Toast.LENGTH_LONG).show();


            }
        });



    }
}