package com.example.cloud.zqchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ZqChart mchart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mchart = (ZqChart) findViewById(R.id.chart);
        ArrayList<Chart> datas = new ArrayList<>();
  /*      for (int i = 0; i < 30; i++) {
            Chart chart=new Chart();
            chart.dateDay= new Random().nextInt(30)+1;
            chart.dateMonth= new Random().nextInt(12)+1;
            chart.money= new Random().nextInt(50)+100;
            datas.add(chart);
        }*/
        for (int i = 0; i < 12; i++) {
            for (int i1 = 0; i1 < 30; i1++) {
                Chart chart=new Chart();
                chart.dateDay= i1+1;
                chart.dateMonth= i+1;
                chart.money= new Random().nextInt(50)+100;
                datas.add(chart);
            }
        }
        mchart.setDatas(datas);
    }
}
