package com.example.markohare.layouttest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Schedule extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public final static String M_KEY = "Key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        Spinner dropdown = (Spinner)findViewById(R.id.spin);
        String[] items = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        dropdown.setOnItemSelectedListener(this);

    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                // Whatever you want to happen when the second item gets selected
                break;
            case 2:
                // Whatever you want to happen when the third item gets selected
                break;
            case 3:
                // Whatever you want to happen when the fourth item gets selected
                break;
            case 4:
                // Whatever you want to happen when the fivth item gets selected
                break;
            case 5:
                // Whatever you want to happen when the sixth item gets selected
                break;
            case 6:
                // Whatever you want to happen when the seventh item gets selected
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void back(View view){
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }

}
