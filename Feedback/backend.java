package com.example.feeedback;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView star1 = findViewById(R.id.imageView2);
        ImageView star2 = findViewById(R.id.imageView3);
        ImageView star3 = findViewById(R.id.imageView4);
        ImageView star4 = findViewById(R.id.imageView5);
        ImageView star5 = findViewById(R.id.imageView6);
        ImageView star6 = findViewById(R.id.imageView7);
        ImageView star7 = findViewById(R.id.imageView8);
        ImageView star8 = findViewById(R.id.imageView9);
        ImageView star9 = findViewById(R.id.imageView10);
        ImageView star10 = findViewById(R.id.imageView11);

        star1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle when star1 is clicked
                star1.setImageResource(R.drawable.fullstar);
            }
        });

        star2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle when star2 is clicked
                star2.setImageResource(R.drawable.fullstar);
            }
        });

        star3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle when star3 is clicked
                star3.setImageResource(R.drawable.fullstar);
            }
        });

        star4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle when star4 is clicked
                star4.setImageResource(R.drawable.fullstar);
            }
        });

        star5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle when star5 is clicked
                star5.setImageResource(R.drawable.fullstar);
            }
        });

        star6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle when star1 is clicked
                star6.setImageResource(R.drawable.fullstar);
            }
        });

        star7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle when star1 is clicked
                star7.setImageResource(R.drawable.fullstar);
            }
        });

        star8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle when star1 is clicked
                star8.setImageResource(R.drawable.fullstar);
            }
        });

        star9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle when star1 is clicked
                star9.setImageResource(R.drawable.fullstar);
            }
        });

        star10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to handle when star1 is clicked
                star10.setImageResource(R.drawable.fullstar);
            }
        });
    }
}
