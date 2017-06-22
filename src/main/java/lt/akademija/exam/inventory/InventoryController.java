package lt.akademija.exam.inventory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import lt.akademija.exam.client.Client;
import lt.akademija.exam.client.ClientRepository;

@RestController
public class InventoryController {

    @Autowired
    private InventoryRepository inventoryRepository;
    

    @GetMapping("/api/inventory")
    @ApiOperation(value = "Returns all inventory that are currently in the list")
    public List<Inventory> getInventory() {
        return inventoryRepository.findAll();
    }

    @DeleteMapping("/api/inventory/{id}")
    public void deleteInventory(@PathVariable Long id) {
        inventoryRepository.delete(id);
    }

    @PostMapping("/api/inventory")
    public Inventory registerInventory(@RequestBody Inventory inventory) {
        return inventoryRepository.save(inventory);
    }
}

	
	

