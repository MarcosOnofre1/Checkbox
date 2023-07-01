package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cbNotificacao = findViewById(R.id.cbNotificacao);
        TextView textNotificacoes = findViewById(R.id.textNotificacoes);

        cbNotificacao.setOnCheckedChangeListener((buttonView, isChecked) -> {

            if (isChecked) {
                textNotificacoes.setText("ON");
            } else {
                textNotificacoes.setText("OFF");

            }
        });
    }
}