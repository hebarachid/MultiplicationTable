package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView myView;
    SeekBar degreeBar;
    public void TimesTable(int i){
        ArrayList<String> Timestab  = new ArrayList<>();
        for (int j =1; j<=10;j++){
            Timestab.add(j + " X " + i + " = " + j*i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Timestab);
        myView.setAdapter(arrayAdapter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myView = findViewById(R.id.myView);
        degreeBar = findViewById(R.id.seekBar2);
        degreeBar.setMax(20);

        degreeBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seek, int i, boolean b) {
                Toast.makeText(MainActivity.this, "Times Table of " + i, Toast.LENGTH_SHORT).show();
                TimesTable(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


}