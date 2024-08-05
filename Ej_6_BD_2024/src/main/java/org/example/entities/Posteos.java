package org.example.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="posts")
public class Posteos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "Autor")
    private String Autor;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "Contenido")
    private String contenido;
    @Column(name = "Fecha_Publicacion")
    private Date FechaPublicacion;
    @OneToMany(mappedBy = "posteo", fetch = FetchType.LAZY)
    private List<Comentarios> comentarios;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        FechaPublicacion = fechaPublicacion;
    }

    public List<Comentarios> getComentariosomentarios() {
        return comentarios;
    }

    public void setComentariosomentarios(List<Comentarios> comentariosomentarios) {
        this.comentarios = comentariosomentarios;
    }
}
