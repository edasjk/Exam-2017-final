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
    private String clientType; 
    
    public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	/*
     * Relation with inventory
     */
    @OneToMany
    private List<Inventory> inventory;

    public Client() {
    }

 	public Client(Long id, String firstName, String lastName, String birthDate, String phone, String clientType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.clientType = clientType;
		this.inventory = inventory;
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


	public List<Inventory> getInventory() {
		return inventory;
	}

	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}
	
   
    
}
