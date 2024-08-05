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

public class PostsServices {
    public List<posteo>ObtenerPostsSinComentarios(){
        Session session=HibernateUtil.getSession();
        List<Posteos>PostsSinComentarios=new ArrayList<>();
        List<posteo>R1=new ArrayList<>();
        try {
            String Sql3=("SELECT p.* FROM posteos p LEFT JOIN comentarios c ON p.id = c.post_id WHERE c.post_id IS NULL ORDER BY p.fecha_publicacion DESC\n");
            Query Consulta3=session.createQuery(Sql3);
            PostsSinComentarios=Consulta3.getResultList();
            session.getTransaction().commit();
        }finally {
            session.close();
        }
        for (Posteos p: PostsSinComentarios){
            R1.add(new posteo(p));
        }
        return R1;
    }
}
