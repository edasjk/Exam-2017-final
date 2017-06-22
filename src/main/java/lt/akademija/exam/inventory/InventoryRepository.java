package lt.akademija.exam.inventory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import lt.akademija.exam.client.Client;

public class InventoryRepository {

    //@PersistenceContext
	@Autowired
    private EntityManager entityManager;


    @Transactional(readOnly = true)
    public Inventory get(Long id) {
        return entityManager.find(Inventory.class, id);
    }

    @Transactional
    public Inventory save(Inventory inventory) {
        return entityManager.merge(inventory);
    }

    @Transactional
    public void delete(Long id) {
        entityManager.remove(entityManager.find(Inventory.class, id));
    }

    @Transactional(readOnly = true)
    public List<Inventory> findAll() {
        //return entityManager.createNamedQuery("findAllInventory").getResultList();
        return entityManager.createQuery("SELECT i from Inventory i").getResultList();
    }
}
