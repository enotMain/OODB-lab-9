import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateDB {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("Enikeev_lab_9");
        entityManagerFactory.close();
    }
}
