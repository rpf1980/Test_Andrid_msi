package com.example.testlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter
{
    private Context context;
    private ArrayList<Pizza> listaItems;

    public Adaptador(Context context, ArrayList<Pizza> listaItems)
    {
        this.context = context;
        this.listaItems = listaItems;
    }

    // Indica al listview cuantos datos se van a cargar
    // Tamaño del arrayList
    @Override
    public int getCount()
    {
        return listaItems.size();
    }

    // Nos da la posición de los items
    @Override
    public Object getItem(int position)
    {
        return listaItems.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    // Aquí será donde se va a crear cada item y se le asignan
    // valores para cada elemento de los items
    // Este método se va a crear tantas veces como lo indique el método getCount
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Pizza Item = (Pizza) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.item_lista, null);

        //Crea cada elemento que contendrá el Item
        ImageView imgFoto = convertView.findViewById(R.id.idImageView);
        TextView tvNombre = convertView.findViewById(R.id.idTvItemLista);

        // Llenamos el imageView
        imgFoto.setImageResource(Item.getImagen());
        tvNombre.setText(Item.getNombre());

        return convertView;
    }
}
