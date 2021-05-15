package com.example.shoesizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    int women = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] arraySpinner = new String[]{
                "Mens", "Womens"
        };

        String[] arraySpinner1 = new String[]{
                "US", "UK", "EU", "CM"
        };

        String[] arraySpinner2 = new String[]{
                "Nike", "Adidas"
        };

        String[] menUs = new String[]{
                "7", "8", "8.5", "9", "9.5", "10", "11", "12", "13"
        };

        String[] menEu = new String[]{
                "40", "41", "42", "42.5", "43", "44", "45", "46", "47"
        };

        String[] menUk = new String[]{
                "6", "7", "7.5", "8", "8.5", "9", "10", "11", "12"
        };

        String[] menCm = new String[]{
                "25", "26", "26.5", "27", "27.5", "28", "29", "30", "31"
        };

        String[] womenUs = new String[]{
                "5", "5.5", "6", "6.5", "7", "8", "8.5", "9.5", "10"
        };

        String[] womenUk = new String[]{
                "2.5", "3", "3.5", "4", "4.5", "5.5", "6", "7", "7.5"
        };

        String[] womenEu = new String[]{
                "35.5", "36", "36.5", "37.5", "38", "39", "40", "41", "42"
        };

        String[] womenCm = new String[]{
                "22", "22.5", "23", "23.5", "24", "25", "25.5", "26.5", "27"
        };

        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        Spinner s1 = (Spinner) findViewById(R.id.spinner01);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arraySpinner1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter1);

        Spinner s2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arraySpinner2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter2);

        Spinner s3 = (Spinner) findViewById(R.id.spinner3);

        Spinner s4 = (Spinner) findViewById(R.id.spinner4);
        s4.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, menUs);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, menEu);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, menUk);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, menCm);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter7 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, womenUs);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter8 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, womenUk);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter9 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, womenEu);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter10 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, womenCm);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==1){
                    s3.setAdapter(adapter7);
                    women = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0 && women == 0){
                    s3.setAdapter(adapter3);
                }
                if(position==1 && women==0){
                    s3.setAdapter(adapter5);
                }
                if(position==2 && women==0){
                    s3.setAdapter(adapter4);
                }
                if(position==3 && women==0){
                    s3.setAdapter(adapter6);
                }
                if(position==0 && women==1){
                    s3.setAdapter(adapter7);
                }
                if(position==1 && women==1){
                    s3.setAdapter(adapter8);
                }
                if(position==2 && women==1){
                    s3.setAdapter(adapter9);
                }
                if(position==3 && women==1){
                    s3.setAdapter(adapter10);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}