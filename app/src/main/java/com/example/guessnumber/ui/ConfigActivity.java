package com.example.guessnumber.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.guessnumber.data.Message;
import com.example.guessnumber.databinding.ActivityConfigBinding;



/**
 * Clase de configuración Aquí se recogen los datos de dos EditText en el primero se recoge el nombre del jugador y en el segundo
 * el numero de intentos en el que quieres jugar, mediante el onclick llamamos a al metodo que recoge los datos y los envia a la
 * siguiente activity
 */
public class ConfigActivity extends AppCompatActivity {

    private ActivityConfigBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConfigBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    public  void getOnclick(View view){

        sendMessage();

    }



    private void sendMessage(){
        Bundle bundle = new Bundle();
        com.example.guessnumber.data.Message message = new Message();
        message.setPlayer(binding.edPlayer.getText().toString());
        message.setAttempts(binding.edAttempts.getText().toString());
        if (binding.edPlayer.length()== 0 || binding.edAttempts.getText().toString().length() ==0)
        {
            Toast.makeText(this,"Los campos son obligatorios", Toast.LENGTH_SHORT).show();
        }
        else {
            bundle.putSerializable("message", message);
            Intent intent = new Intent(this, PlayActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }



    }
}