package lt.akademija.exam.client;

import java.util.Date;

import javax.persistence.*;

/**
 * @author ggrazevicius
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "findAllClients", query = "select client from Client client")
})
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;
    
    private Date birthDate;
    private String phone;
    private enum clientType {
        COMMON, LOYAL 
    } 

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
