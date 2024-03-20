package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.databinding.FragmentWelcomeBinding;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {

    private FragmentWelcomeBinding binding;
    EditText name;
    EditText email;
    EditText password;
    EditText phone;
    EditText confirmPassword;
    MaterialButton createAccount;
    Spinner spinner;
    RadioGroup radioGroup;
    RadioButton radioButton1;
    RadioButton radioButton2;
    String sex="F";
    String level;
    Button form1;
    Button formQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface_exo2);
        name = findViewById(R.id.edit_name_register_os);
        email = findViewById(R.id.edit_email_register_os);
        phone = findViewById(R.id.phone_register_os);
        password = findViewById(R.id.edit_password_register_os);
        confirmPassword = findViewById(R.id.edit_confirm_password_register_os);
        createAccount = findViewById(R.id.btn_create_account_register_os);
        spinner = (Spinner)findViewById(R.id.spinner_level);
        radioGroup = findViewById(R.id.radio_group);
        radioButton1 = findViewById(R.id.radio_btn1_register_os);
        radioButton2 = findViewById(R.id.radio_btn2_register_os);
        form1 = findViewById(R.id.btn_form1);

        formQuiz=findViewById(R.id.btn_formQuiz);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,R.array.level_person,
                android.R.layout.simple_spinner_item
        );
        spinner.setOnItemSelectedListener(this);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        createAccount.setOnClickListener(v->{
            formControl();
        });

        radioButton1.setOnClickListener(v -> {
            sex = radioButton1.getText().toString();

        });

        radioButton2.setOnClickListener(v -> {
            sex = radioButton2.getText().toString();
            Toast.makeText(MainActivity.this, radioButton2.getText().toString(), Toast.LENGTH_LONG).show();
        });

        form1.setOnClickListener(v -> {
            connexionForm1();
        });

        formQuiz.setOnClickListener(v -> {
            connexionFormQuiz();
        });

    }

    private void connexionForm1() {
        Intent intent = new Intent(MainActivity.this, UserListActivity.class);
        //Intent intent = new Intent(MainActivity.this, EssayForm1.class);
        startActivity(intent);
    }

    private void connexionFormQuiz() {
        Intent intent = new Intent(MainActivity.this, WelcomeFragment.class);
        startActivity(intent);
    }

    /**
     * Method to control the form inputs
     */
    public void formControl(){
        String nameContent = name.getText().toString().trim();
        String emailContent = email.getText().toString().trim();
        String passwordContent = password.getText().toString().trim();
        String confirmPasswordContent = confirmPassword.getText().toString().trim();
        String phoneContent = phone.getText().toString().trim();


        if (nameContent.equals("") && emailContent.equals("") && passwordContent.equals("") && confirmPasswordContent.equals("")){
            Toast.makeText(MainActivity.this, getResources().getString(R.string.fill_all_input), Toast.LENGTH_LONG).show();
            return;
        }
        if(nameContent.equals("")){
            Toast.makeText(this, getResources().getString(R.string.fill_name), Toast.LENGTH_LONG).show();
        }
        else if(emailContent.equals("")){
            Toast.makeText(this, getResources().getString(R.string.fill_email), Toast.LENGTH_LONG).show();
        }
        else if(phoneContent.equals("")){
            Toast.makeText(this,getResources().getString(R.string.fill_phone), Toast.LENGTH_LONG).show();
        }
        else if(passwordContent.equals("")){
            Toast.makeText(this, getResources().getString(R.string.fill_password), Toast.LENGTH_LONG).show();
        }
        else if(confirmPasswordContent.equals("")){
            Toast.makeText(this, getResources().getString(R.string.fill_confirm_password), Toast.LENGTH_LONG).show();

        }
        else if(!passwordContent.equals(confirmPasswordContent)){
            Toast.makeText(this, getResources().getString(R.string.wrong_password), Toast.LENGTH_LONG).show();
        }
        else{
            //Toast.makeText(this, getResources().getString(R.string.success_message), Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("Name",nameContent);
            intent.putExtra("Email",emailContent);
            intent.putExtra("Phone",phoneContent);
            intent.putExtra("Level",level);
            intent.putExtra("Sex",sex);
            startActivity(intent);
        }


    }

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            // An item is selected. You can retrieve the selected item using
            // parent.getItemAtPosition(pos).
            level = parent.getItemAtPosition(pos).toString();
            Toast.makeText(MainActivity.this, parent.getItemAtPosition(pos).toString(), Toast.LENGTH_LONG).show();
        }

        public void onNothingSelected(AdapterView<?> parent) {
            // Another interface callback.
        }


}