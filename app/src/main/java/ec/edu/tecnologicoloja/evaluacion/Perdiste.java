package ec.edu.tecnologicoloja.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Perdiste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perdiste);
    }

    //Metodo para regresar a la pantalla inicial
    public void regresarPantallaPrincipal2(View view){
        Intent l = new Intent(this, MainActivity.class);
        startActivity(l);
    }
}