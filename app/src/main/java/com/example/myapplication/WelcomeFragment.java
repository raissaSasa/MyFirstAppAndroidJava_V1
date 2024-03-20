package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentWelcomeBinding;

public class WelcomeFragment extends AppCompatActivity {

    private FragmentWelcomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.fragment_welcome);
        binding = FragmentWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnPlayQuiz.setEnabled(false);
        binding.saiUserNameQuiz.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    protected void onDestroy() {
        super.onDestroy();
        //pour libérer la mémoire
        binding = null;
    }

}