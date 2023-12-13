package com.example.marciano;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText perguntaEditText;
    private TextView respostaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        perguntaEditText = findViewById(R.id.perguntaEditText);
        Button enviarButton = findViewById(R.id.enviarButton);

        enviarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pergunta = perguntaEditText.getText().toString();
                String resposta = outerRepostDoMarciano(pergunta);
                exibirResposta(resposta);
            }
        });
    }

    private String outerRepostDoMarciano(String pergunta) {
        MarcianoPremium marciano = new MarcianoPremium(new MarcianoInterface() {
            @Override
            public String agir() {
                return "Ação personalizada";
            }
        });
        return marciano.responda(pergunta);
    }

    private void exibirResposta(String resposta) {
        setContentView(R.layout.activity_response);
        respostaTextView = findViewById(R.id.respostaTextView);
        respostaTextView.setText(resposta);

        Button voltarButton = findViewById(R.id.voltarButton);
        voltarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Criar um Intent para voltar à MainActivity
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                // Encerrar a atividade atual
                finish();
            }
        });
    }


}