package com.example.androidlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {

    String numbers[]={"one","two","three","four","one","two","three","four","one","two","three","four","one","two","three","four"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView gv=findViewById(R.id.gridvv);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.griddataformat,numbers);
        gv.setAdapter(arrayAdapter);
    }
}
