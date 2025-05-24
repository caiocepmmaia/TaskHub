import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import models.User;

public class GrenciadorProjetosApp {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();

        User user = new User(1, "Muttley","muttley@gmail.com","12345");

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }
}
