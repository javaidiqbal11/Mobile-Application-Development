package com.jtech.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LifeCycle","onStart() invoked");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LifeCycle", "onResume invoked");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("LifeCycle", "onPause invoked");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("LifeCycle","onStop invoked");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("LifeCycle", "onRestart invoked");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LifeCycle", "OnDestroy invoked");
    }
}