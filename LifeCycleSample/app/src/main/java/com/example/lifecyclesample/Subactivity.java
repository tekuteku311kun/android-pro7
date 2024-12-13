package com.example.lifecyclesample;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Subactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LifeCycleSample","Sub onCreate() called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subactivity);
    }

    @Override
    public void onStart(){
        Log.i("LifeCycleSample","Sub onStart() called.");
        super.onStart();
    }
    @Override
    public void onRestart(){
        Log.i("LifeCycleSample","Sub onRestart() called.");
        super.onRestart();
    }

    @Override
    public void onResume(){
        Log.i("LifeCycleSample","Sub onResume() called.");
        super.onResume();
    }

    @Override
    public void onPause(){
        Log.i("LifeCycleSample","Sub onPause() called.");
        super.onPause();
    }

    @Override
    public void onStop(){
        Log.i("LifeCycleSample","Sub onStop() called.");
        super.onStop();
    }

    @Override
    public void onDestroy(){
        Log.i("LifeCycleSample","Sub onDestroy() called.");
        super.onDestroy();
    }
    public void onButtonClick(View view){
        finish();
    }
}