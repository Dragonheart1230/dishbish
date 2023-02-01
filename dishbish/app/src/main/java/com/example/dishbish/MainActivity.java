package com.example.dishbish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] order = {"Max", "Ellisha", "Tupuna", "Nathan", "Rory",
                "Ellisha", "Rory",
                "Max", "Ellisha", "Tupuna", "Nathan", "Rory",
                "Max", "Nathan",
                "Max", "Ellisha", "Tupuna", "Nathan", "Rory",
                "No one", "Tupuna"};


        //String date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        Date startDate = new Date("11/14/2022");
        Date currentDate = new Date();

        long diff = currentDate.getTime() - startDate.getTime();

        System.err.println(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        System.err.println((TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS))%21);
        //int today = currentDate.;
        //System.out.println(currentDate.getDay());ff
        //System.err.println(currentDate - startDate);

        TextView tv = (TextView)findViewById(R.id.textView1);
        tv.setText(order[(int) ((TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS))%21)] +" is dish bish tonight");
    }
}