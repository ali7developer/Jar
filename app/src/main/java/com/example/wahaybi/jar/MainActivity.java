package com.example.wahaybi.jar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.wahaybi.jar.R;

public class MainActivity extends AppCompatActivity {

    String postDetails;
    String categorySelected;
    String locationSelected;
    //String postDetailsToDisplay;
    String name;
    String tool;
    String price;
    String description;
    String number;
    static String textP;



    @Override
    protected void onCreate(Bundle savedInstanceState) throws NullPointerException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<CharSequence> categoriesAdapter = ArrayAdapter.createFromResource(this, R.array.cat, android.R.layout.simple_spinner_item);
        Spinner categoriesSpinner = findViewById(R.id.categories_spinner_id);
        categoriesAdapter.setDropDownViewResource(R.layout.spinner_drop_down_item);
        categoriesSpinner.setAdapter(categoriesAdapter);
        categoriesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("Post", "" + parent.getItemAtPosition(position));
                categorySelected = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> locatoinAdapter = ArrayAdapter.createFromResource(this, R.array.location_array, android.R.layout.simple_spinner_item);
        Spinner locationSpinner = findViewById(R.id.location_spiner_id);
        locatoinAdapter.setDropDownViewResource(R.layout.spinner_drop_down_item2);
        locationSpinner.setAdapter(locatoinAdapter);
        locationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("Post", "" + parent.getItemAtPosition(position));
                locationSelected = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button postButton = findViewById(R.id.post_button_id);
        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameEditText = (EditText)findViewById(R.id.name_edit_text_id);
                name = nameEditText.getText().toString();

                EditText toolEditText = findViewById(R.id.tool_edit_text_id);
                tool = toolEditText.getText().toString();


                EditText priceEditText = findViewById(R.id.price_edit_text_id);
                price = priceEditText.getText().toString();


                EditText descriptionEditText = findViewById(R.id.description_edit_text_id);
                description = descriptionEditText.getText().toString();


                EditText numberEditText = findViewById(R.id.number_edit_text_id);
                number = numberEditText.getText().toString();

                textP = displayRegisterdPost(name, tool, price, categorySelected, locationSelected, description, number);

                Intent postIntent = new Intent(getApplicationContext(), RegisterdPost.class);
                startActivity(postIntent);

            }
        });

        Button clearButton = findViewById(R.id.clear_button_id);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText nameEditText = findViewById(R.id.name_edit_text_id);
                nameEditText.getText().clear();

                EditText toolEditText = findViewById(R.id.tool_edit_text_id);
                toolEditText.getText().clear();

                EditText priceEditText = findViewById(R.id.price_edit_text_id);
                priceEditText.getText().clear();

                EditText descriptionEditText = findViewById(R.id.description_edit_text_id);
                descriptionEditText.getText().clear();

                EditText numberEditText = findViewById(R.id.number_edit_text_id);
                numberEditText.getText().clear();


            }
        });


    }

    public String displayRegisterdPost(String nameM, String toolM, String priceM, String categoryM, String locationM, String descriptionM, String numberM){

        postDetails = "Name: " + nameM;
        postDetails += "\nTool: " + toolM;
        postDetails += "\nPrice: " + priceM;
        postDetails += "\nCategory: " + categoryM;
        postDetails += "\nLocation: " + locationM;
        postDetails += "\nDescription: " + descriptionM;
        postDetails += "\nPhone Number: " + numberM;

        return postDetails;
    }





}



