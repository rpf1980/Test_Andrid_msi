package com.example.testlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private ListView lvItems;
    private Adaptador adaptador;
    private List<Pizza> listaPizzas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = findViewById(R.id.LvItems);
        adaptador = new Adaptador(this, GetArrayItems());

        // Asignamos el adapatador al listview
        lvItems.setAdapter(adaptador);

        //Listener del click items lista
        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Pizza obj = (Pizza) parent.getItemAtPosition(position);

                //Mandamos objeto con intent
                Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
                intent.putExtra("Objeto", (Serializable) obj); //Serializamos el objeto para mandarlo en el intent
                startActivity(intent);
            }
        });
    }

    private ArrayList<Pizza> GetArrayItems()
    {
        ArrayList<Pizza> listItems = new ArrayList<>();
        listItems.add(new Pizza(R.drawable.pizzaicon, "Boloñesa", "15 euros"));
        listItems.add(new Pizza(R.drawable.pizzaicon, "Vegetariana", "14 euros"));
        listItems.add(new Pizza(R.drawable.pizzaicon, "Kebab", "12 euros"));

        return listItems;
    }
}
