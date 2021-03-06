package com.example.androidlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openlinearlayout(View view)
    {
        Intent i=new Intent(this,linearlayout.class);
        startActivity(i);
    }
    public void openrelativelayout(View view)
    {
        Intent i=new Intent(this,relativelayout.class);
        startActivity(i);
    }
    public void opentablelayout(View view)
    {
        Intent i=new Intent(this,tablelayout.class);
        startActivity(i);
    }
    public void openabsolutelayout(View view)
    {
        Intent i=new Intent(this,absolutelayout.class);
        startActivity(i);
    }
    public void openlistview(View view)
    {
        Intent i=new Intent(this,listview.class);
        startActivity(i);
    }
    public void opengridview(View view)
    {
        Intent i=new Intent(this,GridViewActivity.class);
        startActivity(i);
    }
}
