package com.example.markohare.layouttest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String M_KEY = "Key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void passTemp (View view){
        TextView temp = (TextView)findViewById(R.id.targettemp1);
        String text = temp.getText().toString();

        Intent intent = new Intent(this, TempAdjust.class);
        Bundle params = new Bundle();
        params.putString("TEMP", text );
        params.putString("ID", "targettemp1");
        intent.putExtras(params);

        startActivity(intent);


        /*TextView tv = (TextView)findViewById(this.getResources().getIdentifier(params.getString("ID"), "id", getPackageName()));
        String newTemp = params.getString("TEMP");

        tv.setText(newTemp);
*/
    }

    public void passTemp2 (View view){
        TextView temp = (TextView)findViewById(R.id.targettemp2);
        String text = temp.getText().toString();

        Intent intent = new Intent(this, TempAdjust.class);
        Bundle params = new Bundle();
        params.putString("TEMP", text );
        params.putString("ID", "targettemp2");
        intent.putExtras(params);
        startActivity(intent);

    }

    public void passTemp3 (View view){
        TextView temp = (TextView)findViewById(R.id.targettemp3);
        String text = temp.getText().toString();

        Intent intent = new Intent(this, TempAdjust.class);
        Bundle params = new Bundle();
        params.putString("TEMP", text );
        params.putString("ID", "targettemp3");
        intent.putExtras(params);
        startActivity(intent);

    }

    public void passTemp4 (View view){
        TextView temp = (TextView)findViewById(R.id.targettemp4);
        String text = temp.getText().toString();

        Intent intent = new Intent(this, TempAdjust.class);
        Bundle params = new Bundle();
        params.putString("TEMP", text );
        params.putString("ID", "targettemp4");
        intent.putExtras(params);
        startActivity(intent);

    }



/*
    protected void onRestart(){
        super.onRestart();
        Intent intent = getIntent();

        Bundle params = intent.getExtras();
        TextView tv = (TextView)findViewById(this.getResources().getIdentifier(params.getString("ID"), "id", getPackageName()));
        tv.setText(params.getString("TEMP"));


    }
*/
}
