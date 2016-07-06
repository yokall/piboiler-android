package com.example.markohare.layouttest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TempAdjust extends AppCompatActivity  {
    public final static String M_KEY = "Key";
    TextView receive;
    CircularSeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_adjust);
        Intent intent = getIntent();
        Bundle params = intent.getExtras();


        String temp = params.getString("TEMP");
        receive = (TextView)findViewById(R.id.receive);
        receive.setText(temp);

        seekbar = (CircularSeekBar) findViewById(R.id.seekbar);
        seekbar.setProgress(Integer.parseInt(temp));
        seekbar.setOnSeekBarChangeListener(new CircleSeekBarListener(){
           @Override
           public void onProgressChanged(CircularSeekBar circularSeekBar, int progress, boolean fromUser) {
               receive.setText(Integer.toString(progress));
           }
            @Override
            public void onStopTrackingTouch(CircularSeekBar seekBar) {

            }

            @Override
            public void onStartTrackingTouch(CircularSeekBar seekBar) {

            }

        });

    }

    public void openSched (View view){
        Intent inSched = new Intent(this, Schedule.class);
        TextView temp = (TextView)findViewById(R.id.receive);
        String text = temp.getText().toString();

        //inSched.putExtra(M_KEY,text);

        startActivity(inSched);

    }

    public void apply (View view){
        Intent intent = getIntent();
        intent.setClass(this, MainActivity.class);
        TextView newTemp = (TextView)findViewById(R.id.receive);
        String strTemp = newTemp.getText().toString();
        Bundle params = intent.getExtras();
        params.putString("TEMP", strTemp);
        intent.putExtras(params);

        startActivity(intent);





    }




}
