package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import model.BanhNgot;

public class MainActivity2 extends AppCompatActivity {

    private ImageView imgBanh;
    private TextView tvTiTleBanh, tvContentBanh, tvPriceBanh;
    private Button btnAddToCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        int id = bundle.getInt("id");
        int img = bundle.getInt("img");
        String title = bundle.getString("title");
        String content = bundle.getString("content");
        String price = bundle.getString("price");

        imgBanh = findViewById(R.id.imgBanh);
        tvTiTleBanh = findViewById(R.id.tvTiTleBanh);
        tvContentBanh = findViewById(R.id.tvContentBanh);
        tvPriceBanh = findViewById(R.id.tvPriceBanh);

        imgBanh.setImageResource(img);
        tvTiTleBanh.setText(title);
        tvContentBanh.setText(content);
        tvPriceBanh.setText(price);

        // Handle button
        btnAddToCard = findViewById(R.id.btnAddToCard);
        // add event
        btnAddToCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Add to card successfully.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}