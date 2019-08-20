package com.example.laboratorio1pastor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int contador=0;
    private TextView textoContador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoContador=(TextView)findViewById(R.id.txt_marcador);

        if(savedInstanceState != null){
            contador = savedInstanceState.getInt("contador");
            textoContador.setText(String.valueOf(contador));
        }
    }
    public void showToast(View view){
        Toast.makeText(this
                , getString(R.string.mensaje)+" "+textoContador.getText().toString()
                ,Toast.LENGTH_SHORT).show();

        textoContador.setText("0");
        contador=0;
    }
    public void countUp(View view){
        ++contador;
        textoContador.setText(Integer.toString(contador));

    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("contador",contador);
    }
}
