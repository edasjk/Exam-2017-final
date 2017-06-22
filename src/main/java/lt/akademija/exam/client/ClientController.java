package lt.akademija.exam.client;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;
    
    /*
     * Prideti clientus
     */
    
    private final List<Client> clients = Collections.synchronizedList(new ArrayList<>());
    private final AtomicLong idGenerator = new AtomicLong(0);
    private Long id = 1L; 

    
        {
//            Flight telAviv = new Flight();
//            telAviv.setId(idGenerator.incrementAndGet());
//            telAviv.setDate("2017-03-20");
//            telAviv.setTime("14:45");
//            telAviv.setFlightNumber("BT 610");
//            telAviv.setCompany("Air Baltic");
//            telAviv.setStatus(Flight.Status.LANDED);
//            flights.add(telAviv);
        	Client jonas = new Client();
            jonas.setId(idGenerator.incrementAndGet());
        	//jonas.setId(++id);
        	jonas.setFirstName("Jonas");
        	jonas.setLastName("Jonaitis");
        	jonas.setBirthDate("1990.01.01");
        	jonas.setPhone("8677 12345");
        	
        	clients.add(jonas);
        	
        	
        	
        }
    
    

    @GetMapping("/api/clients")
    @ApiOperation(value = "Returns all clients that are currently in the list")
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @DeleteMapping("/api/clients/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientRepository.delete(id);
    }

    @PostMapping("/api/clients")
    public Client registerClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }
}
