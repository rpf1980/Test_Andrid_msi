package com.example.testlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity
{

    ImageView foto;
    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        foto = findViewById(R.id.imgFoto);
        titulo = findViewById(R.id.txtTitulo);

        //https://www.youtube.com/watch?v=3dBZHtw_J9E ( minuto 15:53 )
    }
}
