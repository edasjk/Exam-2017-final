package lt.akademija.exam.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author ggrazevicius
 */

/*
 * Defines CRUD operations with client
 */

@Repository
public class ClientRepository {

	@Autowired
    //@PersistenceContext
    private EntityManager entityManager;


    @Transactional(readOnly = true)
    public Client get(Long id) {
        return entityManager.find(Client.class, id);
    }

    @Transactional
    public Client save(Client client) {
        return entityManager.merge(client);
    }

    @Transactional
    public void delete(Long id) {
        entityManager.remove(entityManager.find(Client.class, id));
    }

    @Transactional(readOnly = true)
    public List<Client> findAll() {
        //return entityManager.createNamedQuery("findAllClients").getResultList();
        return entityManager.createQuery("SELECT c from Client c").getResultList();
    }
    

}
