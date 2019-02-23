package br.edu.ifsc.pdm.geradornumeroaleatorio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void alterarTexto(View view) {

        //Button b = (Button) view;
        //b.setText("Aula de sexta é boa!");

        TextView text = (TextView) findViewById(R.id.text);
        EditText editText = (EditText) findViewById(R.id.editText);
        text.setText(editText.getText().toString());

    }

}
