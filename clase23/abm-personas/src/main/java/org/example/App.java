package org.example;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {

        System.out.println( "Hello World!" );
        //Connection con = DriverManager.getConnection("jdbc:mariadb://localhost/Personas", "root", "samaria");
        //Statement st = con.createStatement();
        //ResultSet rs = st.executeQuery("select * from personas2");
        //while(rs.next()) {
        //    int documento = rs.getInt(1);
        //    String nombre = rs.getString(2);
        //    String apellido = rs.getString(3);
        //    int edad = rs.getInt(4);
        //    System.out.println(documento + " " + nombre + " " + apellido + " " + edad);
        //}

        //rs.close();
        //st.close();
        //con.close();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("personasPU");
        EntityManager em = emf.createEntityManager();
        //TypedQuery<Persona> consulta = em.createQuery("select p from Persona p where p.documento between 10000000 and 15000000 order by edad desc", Persona.class);
        //consulta.getResultStream().forEach(System.out::println);

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Persona> cr = cb.createQuery(Persona.class);
        Root<Persona> root = cr.from(Persona.class);
        cr.select(root).
                where(cb.between(root.get("documento"),10000000,15000000)).
                orderBy(cb.asc(root.get("edad")));

        em.createQuery(cr).setFirstResult(101).setMaxResults(100).getResultStream().forEach(System.out::println);


        //Persona nueva = new Persona(2222,"","",4);
        //em.merge(nueva);

        //EntityTransaction t = em.getTransaction();
        //t.begin();
        //em.flush();
        //t.commit();




        Persona juan = em.find(Persona.class, 111111);

        System.out.println(juan);




        System.exit(1);
        em.remove(juan);

        //juan.setEdad(12);

        EntityTransaction t = em.getTransaction();
        t.begin();
        em.flush();
        //em.merge(juan);



        t.commit();


        em.close();
        emf.close();
    }
}
