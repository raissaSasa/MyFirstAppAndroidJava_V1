package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView fullName;
    TextView fullEmail;
    TextView fullPhone;
    TextView fullSex;
    TextView fullLevel;

    public TextView getFullEmail() {
        return fullEmail;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface_exo1);

        fullName = findViewById(R.id.my_name);
        fullEmail = findViewById(R.id.email_profile);
        fullPhone = findViewById(R.id.phone_profile);
        fullSex = findViewById(R.id.sex_profile);
        fullLevel = findViewById(R.id.level_profile);

        Intent intent = getIntent();
        String valName = intent.getStringExtra("Name");
        String valEmail = intent.getStringExtra("Email");
        String valPhone = intent.getStringExtra("Phone");
        String valSex = intent.getStringExtra("Sex");
        String valLevel = intent.getStringExtra("Level");

        fullName.setText(valName);
        fullEmail.setText(valEmail);
        fullPhone.setText(valPhone);
        fullSex.setText(valSex);
        fullLevel.setText(valLevel);

    }
}