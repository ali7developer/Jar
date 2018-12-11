package com.example.wahaybi.jar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ToolListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_build);

        final ArrayList<Tool> tools = new ArrayList<Tool>();
        tools.add(new Tool("Drill Machine", "2.00 OMR", R.drawable.drill));
        tools.add(new Tool("Screw Driver", "0.200 OMR", R.drawable.screwdriver));
        tools.add(new Tool("Cement Mixer", "30.00 OMR", R.drawable.cementmixer));
        tools.add(new Tool("Hand Saw", "0.500 OMR", R.drawable.handsaw));
        tools.add(new Tool("Wheel Barrow", "0.500 OMR", R.drawable.wheelbarrow));
        tools.add(new Tool("Cutter", "0.300 OMR", R.drawable.cutter));
        tools.add(new Tool("Spade", "0.500 OMR", R.drawable.spade));
        tools.add(new Tool("Plant Shovel", "0.300 OMR", R.drawable.plantshovel));
        tools.add(new Tool("Hammer", "0.200 OMR", R.drawable.hammer));
        tools.add(new Tool("Hoe Shovel", "2.00 OMR", R.drawable.hoeshovel));
        tools.add(new Tool("Wheel Barrow", "0.700 OMR", R.drawable.wheelbarrow2));
        tools.add(new Tool("Watering Can", "0.500 OMR", R.drawable.wateringcan));
        tools.add(new Tool("Wrench", "0.700 OMR", R.drawable.wrench));
        tools.add(new Tool("Watering Hose", "0.500 OMR", R.drawable.hose));
        tools.add(new Tool("Spade", "1.00 OMR", R.drawable.spade2));

        final ToolAdapter toolAdapter = new ToolAdapter(ToolListActivity.this, tools);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(toolAdapter);


listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            Intent drillIntent = new Intent(ToolListActivity.this, Drill.class);
            startActivity(drillIntent);
        }
        if(position == 1){
            Intent screwDriverIntent = new Intent(ToolListActivity.this, com.example.wahaybi.jar.screwDriver.class);
            startActivity(screwDriverIntent);
        }
        if(position == 2){
            Intent cementMixerIntent = new Intent(ToolListActivity.this, CementMixer.class);
            startActivity(cementMixerIntent);
        }
        if (position == 3){
            Intent handSawIntent = new Intent(ToolListActivity.this, HandSaw.class);
            startActivity(handSawIntent);
        }
        if (position == 4){
            Intent wheelBarrowIntent = new Intent(ToolListActivity.this, WheelBarrow.class);
            startActivity(wheelBarrowIntent);
        }
    }
});



//                ListView l = (ListView) parent.getItemAtPosition(0);
//                l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                        Intent listViewIntent = new Intent(ToolListActivity.this, Drill.class);
//                        startActivity(listViewIntent);
//
//                    }
//                });



    }
}
