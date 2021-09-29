import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("personasPU");
        EntityManager em = emf.createEntityManager();

        em.createQuery("select p from Persona p where p.apellido like 'PER%'", Persona.class).
                getResultList().
                forEach(System.out::println);


        //Persona p = em.find(Persona.class, 111111);
        //System.out.println(p);
        //EntityTransaction t = em.getTransaction();
        //t.begin();
        //Persona nueva = new Persona(111111, "Juan", "Perez",10);
        //em.merge(nueva);
        //em.flush();

        //t.commit();

        //;
        //List<Persona> lista =
        //for(Persona p: lista)
        //    System.out.println(p);
        em.close();
        emf.close();
    }
}
