package ec.edu.tecnologicoloja.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonChequear;
    private EditText txtTextoIngresado;
    private Spinner spinner;


    @Override
    public void onClick(View v) {
        /*contarLetras(i);*/

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        txtTextoIngresado = (EditText) findViewById(R.id.editTextIngresado);
        buttonChequear= (Button) findViewById(R.id.btnChequear);
        /*buttonChequear.setOnClickListener(this);*/

        /*findViewById(R.id.btnChequear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //contarLetras(frase);
            }
        });

        public int generarColoresAleatorios(int a){
            Random cAleatorio = new Random();
            int n= cAleatorio.nextInt(a);

        }*/

    }

    public void verificarColores(){

        /*try {
            int txtIngresado = Integer.valueOf(txtTextoIngresado.getText().toString());
            int colAleatorio = generarColoresAleatorios(txtTextoIngresado);
            if(txtIngresado==){
                Toast.makeText(this,"GANASTE, ERES EXCELENTE :-)",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,":-( LO SENTIMOS, PERDISTE. El Número era: "+colAleatorio,Toast.LENGTH_LONG).show();
            }

        }catch(NumberFormatException n){

        }*/

    }
    private void setViews() {
        // Button
        buttonChequear = (Button) findViewById(R.id.btnChequear);

        // EditText
        txtTextoIngresado = (EditText) findViewById(R.id.editTextIngresado);
        spinner = (Spinner) findViewById(R.id.spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_data, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    //Metodo para cambiar de pantalla al resultado Ganaste
    public void cambiarPantallaResultado(View view){
        Intent i = new Intent(this, Ganaste.class);
        startActivity(i);
    }

    //Metodo para cambiar de pantalla al resultado Perdiste
    public void cambiarPantallaResultado2(View view){
        Intent u = new Intent(this, Perdiste.class);
        startActivity(u);
    }

    public int contarLetras (String frase){
        int numeroLetras=0;

        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i)!= ' '){
                numeroLetras++;
            }
        }
        return numeroLetras;
    }


}
