package org.example;

import org.example.DTO.comentario;
import org.example.DTO.posteo;
import org.example.Services.ComentariosServices;
import org.example.Services.PostsServices;
import org.example.entities.Posteos;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ComentariosServices ServicioComentario=new ComentariosServices();
        PostsServices ServicioPost=new PostsServices();


        Posteos Posteo1 = new Posteos();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lea un Id de Posteo");
        int IdPosteo= scanner.nextInt();
        while (IdPosteo !=0){
            System.out.println("Lea un Id de Comentario");
            int IdComentario= scanner.nextInt();

            //Retornar Comentarios de un post
            List<comentario>R1=ServicioComentario.ObtenerComentariosDeUnPost( Posteo1);
            R1.forEach(comentario -> System.out.println("ID: " + comentario.getId() + ",autor: " + comentario.getAutor() + " ,Comentario: " + comentario.getComentario() + ",Fecha de publicacion: " + comentario.getFecha_Comentario()));

            //Retornar numero de comentarios de cada pos
            List<Integer>R2=ServicioComentario.ObtenerNumeroComentariosCadaPost();

            //Retornar post sin comentarios
            List<posteo>R3=ServicioPost.ObtenerPostsSinComentarios();
            R3.forEach(posteo1 -> System.out.println("ID: " + posteo1.getId() + " titulo" + posteo1.getTitulo() + ", Contenido" + posteo1.getContenido() + ", Fecha publicacion" + posteo1.getFechaPublicacion()));

            System.out.println("Lea un Id de Posteo");
            IdPosteo = scanner.nextInt();
        }
    }
}