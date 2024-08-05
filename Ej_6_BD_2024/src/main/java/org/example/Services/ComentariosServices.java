package org.example.Services;
import org.example.DTO.comentario;
import org.example.DTO.posteo;
import org.example.connections.HibernateUtil;
import org.example.entities.Comentarios;
import org.example.entities.Posteos;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ComentariosServices {
    public void CrearNuevoComentario(posteo posteo){
        Session session= HibernateUtil.getSession();
        try {
            session.beginTransaction();
            session.save(posteo);
            session.getTransaction().commit();
        }finally {
            session.close();
        }
    }
    public List<comentario> ObtenerComentariosDeUnPost(Posteos posteo){
        Session session=HibernateUtil.getSession();
        List<Comentarios> ObtenerComentarios=new ArrayList<>();
        List<comentario>R=new ArrayList<>();
        try{
        String Sql1=("SELECT \n" +
                "    c.ID,\n" +
                "    c.autor,\n" +
                "    c.comentario,\n" +
                "    c.fecha_comentario\n" +
                "FROM \n" +
                "    comentarios c\n" +
                "WHERE >=?");
        Query Consulta= session.createQuery(Sql1)

                .setParameter("posteo", posteo);
                ObtenerComentarios=Consulta.getResultList();
                session.getTransaction().commit();
        } finally {
            session.close();
        }

                for (Comentarios c:ObtenerComentarios){
                    R.add(new comentario(c));
                }
        return R;
    }
    public List<Integer>ObtenerNumeroComentariosCadaPost(){
        Session session=HibernateUtil.getSession();
        List<Integer>ComentariosDeUnPost=new ArrayList<>();
        try {
            String Sql2=("SELECT p.id, p.titulo, COUNT(c.id) AS numero_de_comentarios\n" +
                    "FROM posts p\n" +
                    "LEFT JOIN comentarios c ON p.id = c.post_id\n" +
                    "GROUP BY p.id, p.titulo\n" +
                    "ORDER BY p.id;");
            Query Consulta2=session.createQuery(Sql2);
            ComentariosDeUnPost=Consulta2.getResultList();
        }finally {
            session.close();
        }
        return ComentariosDeUnPost;
    }




}
