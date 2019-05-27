package com.example.ciclodevidaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(MainActivity.class.toString(), "método onCreate");
        Toast.makeText(this, "Eu sou o onCreate", Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MainActivity.class.toString(), "método onStart");
        Toast.makeText(this, "Eu sou o onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MainActivity.class.toString(), "método onResume");
        Toast.makeText(this, "Eu sou o onResume", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MainActivity.class.toString(), "método onPause");
        Toast.makeText(this, "Eu sou o onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MainActivity.class.toString(), "método onStop");
        Toast.makeText(this, "Eu sou o onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MainActivity.class.toString(), "método onDestroy");
        Toast.makeText(this, "Eu sou o onDestroy", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MainActivity.class.toString(), "método onRestart");
        Toast.makeText(this, "Eu sou o onRestart", Toast.LENGTH_LONG).show();
    }
}
