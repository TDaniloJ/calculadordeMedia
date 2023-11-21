package com.tecnojogos.calcularmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2, n3, n4;
    private TextView resultado;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.nota1);
        n2 = findViewById(R.id.nota2);
        n3 = findViewById(R.id.nota3);
        n4 = findViewById(R.id.nota4);
        resultado = findViewById(R.id.resultado);

        bt = findViewById(R.id.buttonRecuperacao);
    }

    public void calcular(View view) {
        Double nt1 = Double.parseDouble(n1.getText().toString());
        Double nt2 = Double.parseDouble(n2.getText().toString());
        Double nt3 = Double.parseDouble(n3.getText().toString());
        Double nt4 = Double.parseDouble(n4.getText().toString());
        Double media = (nt1 + nt2 + nt3 + nt4) / 4;

        if (media >= 7) {
            resultado.setText("Aprovador! Média é: " + media);
        } else if(media >= 5){
            resultado.setText("Recuperação! Média é: " + media);
            bt.setVisibility(View.VISIBLE);
        } else if(media < 5) {
            resultado.setText("Reprovado! Média é: " + media);
        }
    }

    public  void limpar(View view) {
        n1.setText("");
        n2.setText("");
        n3.setText("");
        n4.setText("");
        resultado.setText(" - - - - -");
        bt.setVisibility(View.INVISIBLE);
    }

    public void recuperacao(View view) {
        //teste
    }
}