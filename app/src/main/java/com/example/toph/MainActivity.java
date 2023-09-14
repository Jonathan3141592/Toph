package com.example.toph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Base_Theme_Toph);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

    }
    public void IniciarSesion (View view){

        TextView correo = (TextView) findViewById(R.id.correo);
        TextView contraseña = (TextView) findViewById(R.id.contraseña);
        Button boton = (Button) findViewById(R.id.Iniciar_Sesion);

        if(correo.getText().toString().toLowerCase().equals("admin@gmail.com") && contraseña.getText().toString().equals("admin123")){
            Toast.makeText(this,"Inicio de sesion exitosa", Toast.LENGTH_LONG).show();
            setContentView(R.layout.activity_main);
        }else
            Toast.makeText(this,"Correo o Contraseña Incorrectos", Toast.LENGTH_LONG).show();


    }
    public void IrCalendario(View view ){
        setContentView(R.layout.calendario);
    }
    public void IrConfiguracion(View view ){
        setContentView(R.layout.configuracion);
    }
    public void IrCuentas(View view ){
        setContentView(R.layout.cuentas);
    }
    public void IrAcercaDe(View view ){
        setContentView(R.layout.acerca_de);
    }
}