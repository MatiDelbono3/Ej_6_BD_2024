package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name="comentarios")
public class Comentarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "autor")
    private String Autor;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "fecha_comentario")
    private String fecha_comentario;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Posteos  posteo;

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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha_comentario() {
        return fecha_comentario;
    }

    public void setFecha_comentario(String fecha_comentario) {
        this.fecha_comentario = fecha_comentario;
    }

    public Posteos getPosteo() {
        return posteo;
    }

    public void setPosteo(Posteos posteo) {
        this.posteo = posteo;
    }
}
