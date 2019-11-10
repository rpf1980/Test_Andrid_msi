package com.example.mainactiviy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView listaDatos;
    ArrayList<Datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos = findViewById(R.id.lstDatos);

        // Lista de Objetos Datos
        Lista = new ArrayList<Datos>();

        // Cargar datos a la lista
        Lista.add(new Datos(1, "Boloñesa", "Pizza extra de mozzarella", R.drawable.img1));
        Lista.add(new Datos(2, "Vegetariana", "Ideal para veganos", R.drawable.img2));
        Lista.add(new Datos(3, "Barbacoa", "Para los amantes del ketchup", R.drawable.img3));

        Adaptador miadaptador = new Adaptador(getApplicationContext(), Lista);
        listaDatos.setAdapter(miadaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                //Obj tendrá todo el objeto en la posición indicada
                Datos obj = (Datos) parent.getItemAtPosition(position);

                //Vamos a otra Actividad para mostrar el detalle
                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("objeto", (Serializable) obj); //De esta forma serializamos un objeto dentro del un campo llamado "objeto"
                startActivity(paso);
            }
        });
    }
}
