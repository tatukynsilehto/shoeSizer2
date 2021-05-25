package com.example.shoesizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int nike = 0;
    int women = 0;
    int adidas = 0;
    int wantNike = 0;
    int wantAdidas = 0;
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

        String[] nikemenUs = new String[]{
                "6", "6.5", "7", "7,5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "11.5", "12", "13", "14", "15" //16
        };

        String[] nikemenEu = new String[]{
                "38.5", "39", "40", "40.5", "41", "42", "42.5", "43", "44", "44.5", "45", "45.5", "46", "47.5", "48.5", "49.5" //16
        };

        String[] nikemenUk = new String[]{
                "5.5", "6", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "12", "13", "14" //16
        };

        String[] nikemenCm = new String[]{
                "24", "24.5", "25", "25.5", "26", "26.5", "27", "27.5", "28", "28.5", "29", "29.5", "30", "31", "32", "33" //16
        };

        String[] nikewomenUs = new String[]{
                "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "11.5", "12" //16
        };

        String[] nikewomenUk = new String[]{
                "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5" //16
        };

        String[] nikewomenEu = new String[]{
                "35.5", "36", "36.5", "37.5", "38", "38.5", "39", "40", "40.5", "41", "42", "42.5", "43", "44", "44.5" //16
        };

        String[] nikewomenCm = new String[]{
                "22", "22.5", "23", "23.5", "24", "24.5", "25", "25.5", "26", "26.5", "27", "27.5", "28", "28.5", "29" //16
        };

        String[] adidasmenUs = new String[]{
                "6", "6.5", "7", "7,5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "11.5", "12", "13", "14", "15" //16
        };

        String[] adidasmenUk = new String[]{
                "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "11.5", "12.5", "13.5", "14.5" //16
        };

        String[] adidasmenEu = new String[]{
                "38 2/3", "39 1/3", "40", "40 2/3", "41 1/3", "42", "42 2/3", "43 1/3", "44", "44 2/3", "45 1/3", "46", "46 1/3", "48", "49 1/3", "50 2/3" //16
        };

        String[] adidasmenCm = new String[]{
                "24", "24.5", "25", "25.5", "26", "26.5", "27", "27.5", "28", "28.5", "29", "29.5", "30", "31", "32", "33" //16
        };

        String[] adidaswomenUs = new String[]{
                "4", "4.5", "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "12" //16
        };

        String[] adidaswomenUk = new String[]{
                "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10.5" //16
        };

        String[] adidaswomenEu = new String[]{
                "35", "35.5", "36", "36 2/3", "37 1/3", "38", "38 2/3", "39 1/3", "40", "40 2/3", "41 1/3", "42", "42 2/3", "43 1/3", "44", "45" //16
        };

        String[] adidaswomenCm = new String[]{
                "21", "21.5", "22", "22.5", "23", "23.5", "24", "24.5", "25", "25.5", "26", "26.5", "27", "27.5", "28", "29" //16
        };

        TextView result = (TextView) findViewById(R.id.textView7);

        //gender
        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        //us eu etc...
        Spinner s1 = (Spinner) findViewById(R.id.spinner01);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arraySpinner1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter1);

        //brand
        Spinner s2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arraySpinner2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter2);

        //size
        Spinner s3 = (Spinner) findViewById(R.id.spinner3);

        //brand to buy
        Spinner s4 = (Spinner) findViewById(R.id.spinner4);
        s4.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikemenUs);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikemenEu);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikemenUk);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikemenCm);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter7 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikewomenUs);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter8 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikewomenUk);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter9 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikewomenEu);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter10 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikewomenCm);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter11 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidasmenUs);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter12 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidasmenUk);
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter13 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidasmenEu);
        adapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter14 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidasmenCm);
        adapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter15 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidaswomenUs);
        adapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter16 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidaswomenUk);
        adapter16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter17 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidaswomenEu);
        adapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter18 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidaswomenCm);
        adapter18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    nike = 1;
                    adidas = 0;
                }
                if(position==1){
                    adidas = 1;
                    nike = 0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    s1.setAdapter(adapter1);
                    s2.setAdapter(adapter2);
                    s3.setAdapter(adapter3);
                    women = 0;


                }
                if(position==1){
                    s1.setAdapter(adapter1);
                    s2.setAdapter(adapter2);
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
                if(position==0 && women==0 && nike==1){
                    s3.setAdapter(adapter3);
                }
                if(position==1 && women==0 && nike==1){
                    s3.setAdapter(adapter5);
                }
                if(position==2 && women==0 && nike==1){
                    s3.setAdapter(adapter4);
                }
                if(position==3 && women==0 && nike==1){
                    s3.setAdapter(adapter6);
                }
                if(position==0 && women==1 && nike==1){
                    s3.setAdapter(adapter7);
                }
                if(position==1 && women==1 && nike==1){
                    s3.setAdapter(adapter8);
                }
                if(position==2 && women==1 && nike==1){
                    s3.setAdapter(adapter9);
                }
                if(position==3 && women==1 && nike==1){
                    s3.setAdapter(adapter10);
                }
                if(position==0 && women==0 && adidas==1){
                    s3.setAdapter(adapter11);
                }
                if(position==1 && women==0 && adidas==1){
                    s3.setAdapter(adapter12);
                }
                if(position==2 && women==0 && adidas==1){
                    s3.setAdapter(adapter13);
                }
                if(position==3 && women==0 && adidas==1){
                    s3.setAdapter(adapter14);
                }
                if(position==0 && women==1 && adidas==1){
                    s3.setAdapter(adapter15);
                }
                if(position==1 && women==1 && adidas==1){
                    s3.setAdapter(adapter16);
                }
                if(position==2 && women==1 && adidas==1){
                    s3.setAdapter(adapter17);
                }
                if(position==3 && women==1 && adidas==1){
                    s3.setAdapter(adapter18);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    wantNike = 1;
                    wantAdidas = 0;
                }
                if(position==1){
                    wantNike = 0;
                    wantAdidas = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}