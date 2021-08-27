package ec.edu.tecnologicoloja.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ganaste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganaste);
    }
    public void regresarPantallaPrincipal(View view){
        Intent p = new Intent(this, MainActivity.class);
        startActivity(p);
    }
}