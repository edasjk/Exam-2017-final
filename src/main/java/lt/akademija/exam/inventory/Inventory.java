package lt.akademija.exam.inventory;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Inventory {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
	private double weight;

    @Size(min = 1, max = 40)
    private int sector;
    
    private String date;

    public Inventory() {
		super();
	}
    

    /*
     * Constructor with all fields
     */

	public Inventory(Long id, String title, double weight, int sector, String date) {
		super();
		this.id = id;
		this.title = title;
		this.weight = weight;
		this.sector = sector;
		this.date = date;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getSector() {
		return sector;
	}

	public void setSector(int sector) {
		this.sector = sector;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}



}
