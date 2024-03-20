package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import kotlin.collections.ArrayDeque;

public class UserListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PersonAdapter personAdapter;
    private List<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        //Initialisation de ma liste de personnes
        personList = new ArrayDeque<>();

        recyclerView = findViewById(R.id.list_recycler_view_form1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        //
        Person person1 = new Person("Raïssa","TEPE","05/09/1998","Agodékè-Lomé",'F',"raissa.tepe@gmail.com");
        Person person2 = new Person("Sadrax","APETY","1996","Agoè-Sogbossito",'M',"sadraxapety@gmail.com");
        Person person3 = new Person("Stanislas","MABALO","1997","Agoè-Aboudja",'M',"stanislasmabalo@gmail.com");
        Person person4 = new Person("Francis","AHONSU","1995","Adidogomé",'M',"francis@gmail.com");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        personAdapter = new PersonAdapter(personList);
        recyclerView.setAdapter(personAdapter);

    }
}