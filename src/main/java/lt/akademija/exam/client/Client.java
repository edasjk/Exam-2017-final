package lt.akademija.exam.client;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lt.akademija.exam.inventory.Inventory;

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
    
    private String birthDate;
    private String phone;
    private enum clientType {
        COMMON, LOYAL 
    } 
    
    /*
     * Relation with inventory
     */
    @OneToMany
    private List<Inventory> inventory;

    public Client() {
    }

    public Client(Long id, String firstName, String lastName, String birthDate, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phone = phone;
	}
    
	public Client(Long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
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



	public String getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    
}
