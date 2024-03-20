package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class EssayForm1 extends AppCompatActivity {

    EditText fullNameForm1;
    EditText addressForm1;
    Button addListForm1;
    ListView listForm1;
    ArrayList<String> dataList;

    //ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.essay_form1);
        fullNameForm1 = (EditText) findViewById(R.id.full_name_form1);
        addressForm1 = (EditText) findViewById(R.id.address_form1);
        addListForm1 = (Button) findViewById(R.id.btn_add_form1);
        listForm1 = (ListView) findViewById(R.id.list_view_form1);

        dataList = new ArrayList<>();


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);
        listForm1.setAdapter(adapter);



        addListForm1.setOnClickListener(v -> {
            from1Control();
        });
    }

    private void from1Control() {
        String contentFullNameForm1 = fullNameForm1.getText().toString().trim();
        String contentAddressForm1 = addressForm1.getText().toString().trim();

        if (contentFullNameForm1.equals("") && contentAddressForm1.equals("")) {
            Toast.makeText(EssayForm1.this, "Veuillez renseigner tous les champs", Toast.LENGTH_SHORT).show();
        } else if (contentFullNameForm1.equals("")) {
            Toast.makeText(EssayForm1.this, "Veuillez renseigner votre nom", Toast.LENGTH_SHORT).show();
        } else if (contentAddressForm1.equals("")) {
            Toast.makeText(EssayForm1.this, "Veuillez renseigner votre adresse", Toast.LENGTH_SHORT).show();
        } else {
            //Add listForm1
            dataList.add(0, contentFullNameForm1);
            dataList.add(1, contentAddressForm1);
            //adapter.notifyDataSetChanged();

            fullNameForm1.setText("");
            addressForm1.setText("");
        }
    }



}