package com.example.androidlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tablelayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablelayout);
    }
    public void Home(View view)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
