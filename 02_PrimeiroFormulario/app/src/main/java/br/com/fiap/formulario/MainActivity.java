package br.com.fiap.formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view){
        String nome = edtNome.getText().toString();
        if (nome.trim().isEmpty()){
            Toast.makeText(this, "Informe o nome corretamente " + nome, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Olá " + nome, Toast.LENGTH_SHORT).show();
        }
    }
}