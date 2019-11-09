package com.example.testlistview;

import java.io.Serializable;

public class Pizza implements Serializable
{
    private int imagen;
    private String nombre;
    private String precio;

    public Pizza(int imagen, String nombre, String precio)
    {
        this.imagen = imagen;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getPrecio()
    {
        return precio;
    }

    public void setPrecio(String precio)
    {
        this.precio = precio;
    }

    public int getImagen()
    {
        return imagen;
    }

    public void setImagen(int imagen)
    {
        this.imagen = imagen;
    }
}
