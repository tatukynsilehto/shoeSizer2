package com.example.shoesizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String country1 = "";

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

        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        Spinner s1 = (Spinner) findViewById(R.id.spinner01);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arraySpinner1);
        s1.setAdapter(adapter1);

        Spinner s2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arraySpinner2);
        s2.setAdapter(adapter2);


        int index = s1.getSelectedItemPosition();

        if (index == 0) {
            Spinner s3 = (Spinner) findViewById(R.id.spinner3);
            ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, menUs);
            s3.setAdapter(adapter3);
        }
        else if (index == 1) {
            Spinner s3 = (Spinner) findViewById(R.id.spinner3);
            ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, menEu);
            s3.setAdapter(adapter3);
        }
        else {
            Spinner s3 = (Spinner) findViewById(R.id.spinner3);
            ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arraySpinner2);
            s3.setAdapter(adapter3);
        } {

        }
    }
}