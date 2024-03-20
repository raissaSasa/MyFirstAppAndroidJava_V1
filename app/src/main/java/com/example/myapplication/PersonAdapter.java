package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private final List<Person> personList;

    public PersonAdapter(List<Person> personList){
        this.personList = personList;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent,false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder,int position) {
        Person person = personList.get(position);
        holder.fullNameItem.setText(person.getName());
        holder.fullEmailItem.setText(person.getEmail());
    }

    @Override
    public int getItemCount(){
        return personList.size();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        public MaterialTextView fullNameItem;
        public MaterialTextView fullEmailItem;
        public ImageView imageItem;

        public PersonViewHolder(View view){
            super(view);
            fullNameItem = view.findViewById(R.id.full_name_item);
            fullEmailItem = view.findViewById(R.id.full_email_item);
            imageItem = view.findViewById(R.id.image_item);
        }

    }
}
