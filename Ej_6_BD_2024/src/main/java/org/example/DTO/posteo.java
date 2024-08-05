package org.example.DTO;

import org.example.entities.Posteos;

import java.util.Date;

public class posteo {
    private int Id;
    private String Titulo;
    private String Contenido;
    private Date FechaPublicacion;
    public posteo(Posteos p){
        int Id=p.getId();
        String Titulo=p.getTitulo();
        String Contenido=p.getContenido();
        Date FechaPublicacion=p.getFechaPublicacion();
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }

    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        FechaPublicacion = fechaPublicacion;
    }
}
