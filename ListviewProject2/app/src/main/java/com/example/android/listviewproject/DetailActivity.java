package com.example.android.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView theImage = findViewById(R.id.imageView22);
        TextView theText = findViewById(R.id.textView22);


           Bundle deliveredFood= getIntent().getExtras();

           Items currentfood =(Items) deliveredFood.getSerializable("currentfood");

           theText.setText(currentfood.getItemName());
           theImage.setImageResource(currentfood.getItemImage());
    }
}