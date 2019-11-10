package com.example.mainactiviy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity
{
    ImageView foto;
    TextView titulo, detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        foto = (ImageView) findViewById(R.id.imageView);
        titulo = (TextView) findViewById(R.id.textTitulo);
        detalle = (TextView) findViewById(R.id.txtDetalle);

        // Recibimos el objeto serializado
        Datos obj = (Datos) getIntent().getExtras().getSerializable("objeto");

        // Cargamos la info dentro de los objetos que estamos serializando
        foto.setImageResource(obj.getImagen());
        titulo.setText(obj.getTitulo());
        detalle.setText(obj.getDetalle());

    }
}
