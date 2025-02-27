package com.example.intentsample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuThanksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_thanks);

        Intent intent = getIntent();

        String menuName = intent.getStringExtra("menuName");
        String menuPrice = intent.getStringExtra("menuPrice");


        TextView tvMenuName = findViewById(R.id.tvMenuName);
        TextView tvMenuPrice = findViewById(R.id.tvMenuPrice);

        tvMenuName.setText(menuName);
        tvMenuPrice.setText(menuPrice);
    }

    public void onBackButtonClick(View view){
        finish();
    }
}