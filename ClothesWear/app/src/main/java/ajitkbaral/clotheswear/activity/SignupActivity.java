package ajitkbaral.clotheswear.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import ajitkbaral.clotheswear.R;

public class SignupActivity extends AppCompatActivity {

    private Context mContext;
    private Spinner spinnerDay, spinnerMonth, spinnerYear;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mContext = this;
        // Spinner element
        spinnerDay = (Spinner) findViewById(R.id.spinnerDay);
        spinnerMonth = (Spinner) findViewById(R.id.spinnerMonth);
        spinnerYear = (Spinner) findViewById(R.id.spinnerYear);

        btnSignUp = (Button) findViewById(R.id.btnSignup);

        day();
        month();
        year();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

    private void day() {
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<Integer> days = new ArrayList<Integer>();
        for (int i=1;i<=31;i++) {
            days.add(i);
        }

        // Creating adapter for spinner
        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, days);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerDay.setAdapter(dataAdapter);
    }

    private void month() {
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<Integer> months = new ArrayList<Integer>();
        for (int i=1;i<=12;i++) {
            months.add(i);
        }

        // Creating adapter for spinner
        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, months);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerMonth.setAdapter(dataAdapter);
    }

    private void year() {
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<Integer> years = new ArrayList<Integer>();
        for (int i=1940;i<=2018;i++) {
            years.add(i);
        }

        // Creating adapter for spinner
        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, years);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerYear.setAdapter(dataAdapter);
    }

}
