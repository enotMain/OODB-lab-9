import domain.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreateDB {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("Enikeev_lab_9");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Client client = new Client();
        client.setId(2L);
        client.setEmail("Email_1");
        client.setName("Name_1");
        client.setPhoneNumber(123);
        client.setSurname("Surname_1");

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(client);
        transaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
