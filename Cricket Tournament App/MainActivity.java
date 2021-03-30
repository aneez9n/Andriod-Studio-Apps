package com.example.psl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updatescore1(View view) {
        TextView tv = (TextView)findViewById(R.id.a4);
        String score = tv.getText().toString();
        String[] parts = score.split("/");
        String pscore = parts[0];
        String pwickets = parts[1];
        int update = Integer.parseInt(pscore);
        update++;

        pscore = update+"";
        tv.setText(pscore+"/"+pwickets);

    }

    public void updateWickets1(View view) {
        TextView tv = (TextView)findViewById(R.id.a4);
        String score = tv.getText().toString();
        String[] parts = score.split("/");
        String pscore = parts[0];
        String pwickets = parts[1];
        int update = Integer.parseInt(pwickets);
        update++;

        pwickets = update+"";
        tv.setText(pscore+"/"+pwickets);

    }

    public void updatescore2(View view) {
        TextView tv = (TextView)findViewById(R.id.a5);
        String score = tv.getText().toString();
        String[] parts = score.split("/");
        String pscore = parts[0];
        String pwickets = parts[1];
        int update = Integer.parseInt(pscore);
        update++;

        pscore = update+"";
        tv.setText(pscore+"/"+pwickets);


    }

    public void updateWickets2(View view) {
        TextView tv = (TextView)findViewById(R.id.a5);
        String score = tv.getText().toString();
        String[] parts = score.split("/");
        String pscore = parts[0];
        String pwickets = parts[1];
        int update = Integer.parseInt(pwickets);
        update++;

        pwickets = update+"";
        tv.setText(pscore+"/"+pwickets);

    }

    public void reset(View view) {
        TextView tv = (TextView)findViewById(R.id.a4);
        tv.setText("0/0");




    }

    public void reset2(View view) {
        TextView tv = (TextView)findViewById(R.id.a5);
        tv.setText("0/0");



    }
}