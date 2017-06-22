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

    private String inventoryName;

    private String weight;
    
    @Size(min = 1, max = 40)
    private byte sector;
    
    private Date inventoryDate;

}
