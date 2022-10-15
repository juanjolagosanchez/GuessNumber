package com.example.guessnumber.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.guessnumber.data.Message;
import com.example.guessnumber.databinding.ActivityEndPlayBinding;

/**
 * Activity final que muestra que has ganado y el numero de intentos en el que lo has hecho
 */
public class EndPlayActivity extends AppCompatActivity {

    private ActivityEndPlayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityEndPlayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Message message;
        message = (Message) bundle.getSerializable("message");
        binding.tvFinal.setText(message.getWinLose()+" en "+message.getAttempts()+" Intentos, el numero es "+message.getNumber());


    }
}