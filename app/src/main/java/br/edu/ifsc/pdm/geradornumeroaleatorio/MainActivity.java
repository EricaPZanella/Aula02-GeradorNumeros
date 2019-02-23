package br.edu.ifsc.pdm.geradornumeroaleatorio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void alterarTexto(View view) {

    int numAux;
    numAux = 1 + (int) (Math.random() * 100);

    TextView text = (TextView) findViewById(R.id.text);
    text.setText(Integer.toString(numAux));

    }

}
