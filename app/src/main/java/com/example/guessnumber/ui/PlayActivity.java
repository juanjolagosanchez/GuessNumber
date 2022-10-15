package com.example.guessnumber.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.guessnumber.R;
import com.example.guessnumber.data.Message;
import com.example.guessnumber.databinding.ActivityPlayBinding;

import java.util.Random;

/**
 * clase PlayActivity en esta actividad se realiza el juego y se envian los datos a la endActivity
 * Para tener un numero random he hecho uso de la clase Random y mediante binding conecto la aplicación
 * con mi vista activity_Play
 */
public class PlayActivity extends AppCompatActivity {



    private ActivityPlayBinding binding;

    int counter = 1;
    int result;
    Random rnd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityPlayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int min =1;
        int max= 100;
        result = rnd.nextInt(max)+min;


    }


    public void getOnclick(View view){
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Message message;
        message = (Message) bundle.getSerializable("message");
        String attemptsS = message.getAttempts();
        int attempts = Integer.parseInt(attemptsS);


        if (binding.edNumber.length()==0){

            Toast.makeText(this,"Es obligatorio poner un numero", Toast.LENGTH_SHORT).show();
        }
        else {
            if (counter <=attempts) {

                String UserGessingS = binding.edNumber.getText().toString();
                int UserGessing = Integer.parseInt(UserGessingS);

                if (UserGessing > result) {
                    counter++;
                    binding.tvResult.setText(getResources().getString(R.string.LowerNumber));

                }

                else if (UserGessing < result) {
                    counter++;
                    binding.tvResult.setText(getResources().getString(R.string.higherNumber));

                } else {
                    senResultWin();

                }
            }
            else{
                senResultLose();
            }
        }



    }
    public void getOnclickReset(View view){
        binding.edNumber.setText("");
        binding.tvResult.setText("");
        counter = 1;
        binding.btnTest.setEnabled(true);

    }

    private void senResultWin(){
        String s = String.valueOf(counter);
        Bundle bundle = new Bundle();
        com.example.guessnumber.data.Message message = new Message();
        message.setAttempts(s);
        message.setPlayer(message.getPlayer());
        message.setNumber(result);
        message.setWinLose("Has ganado");
        bundle.putSerializable("message", message);
        Intent intent = new Intent(this,EndPlayActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void senResultLose(){
        String s = String.valueOf(counter);
        Bundle bundle = new Bundle();
        com.example.guessnumber.data.Message message = new Message();
        message.setAttempts(s);
        message.setPlayer(message.getPlayer());
        message.setNumber(result);
        message.setWinLose("Has Perdido");
        bundle.putSerializable("message", message);
        Intent intent = new Intent(this,EndPlayActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}