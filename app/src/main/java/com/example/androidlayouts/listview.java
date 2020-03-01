package com.example.androidlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        String values[]={"C++","JAVA","PYTHON","ANDROID","C#","ASSEMBLY","RUBY","SCALA"};
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.listdataformat,values);

        ListView lv=(ListView)findViewById(R.id.listview);
        lv.setAdapter(arrayAdapter);
    }
}
