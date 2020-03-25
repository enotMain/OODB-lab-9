package domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company extends CompanyAbstract {

    @Id
    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
