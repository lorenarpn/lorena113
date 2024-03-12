package br.com.app1.lorena1132;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    Button btnEnviar;
    TextView tvMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.editNome);
        btnEnviar = findViewById(R.id.btnBotaoIn);
        tvMensagem = findViewById(R.id.tvNome);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pegar informação do edittext
                String nome = edtNome.getText().toString();
                String mensagem ="Olá, " + nome;
                tvMensagem.setText(mensagem);
            }
        });
    }
}