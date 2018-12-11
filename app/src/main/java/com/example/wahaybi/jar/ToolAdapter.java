package com.example.wahaybi.jar;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ToolAdapter extends ArrayAdapter<Tool> {

    public ToolAdapter(Activity context, ArrayList<Tool> tools){
        super(context, 0, tools);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Tool currentTool = getItem(position);

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        TextView toolTextView = listItemView.findViewById(R.id.text_view_tool);
        toolTextView.setText(currentTool.getTool());

        TextView priceTextView = listItemView.findViewById(R.id.text_view_price);
        priceTextView.setText(currentTool.getPrice());

        ImageView imageView = listItemView.findViewById((R.id.image_view));
        imageView.setImageResource(currentTool.getImageResourceId());



        return listItemView;
    }
}

