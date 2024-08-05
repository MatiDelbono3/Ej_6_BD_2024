package org.example.DTO;

import java.util.Date;
import org.example.entities.*;
public class comentario {
    private int Id;
    private int Post_Id;
    private String autor;
    private String Comentario;
    private Date Fecha_Comentario;
    public comentario(Comentarios c){
       int  id=c.getId();
       String autor=c.getAutor();
       String comentario=c.getComentario();
       Date fechaComentario=new Date();
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPost_Id() {
        return Post_Id;
    }

    public void setPost_Id(int post_Id) {
        Post_Id = post_Id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public Date getFecha_Comentario() {
        return Fecha_Comentario;
    }

    public void setFecha_Comentario(Date fecha_Comentario) {
        Fecha_Comentario = fecha_Comentario;
    }
}
