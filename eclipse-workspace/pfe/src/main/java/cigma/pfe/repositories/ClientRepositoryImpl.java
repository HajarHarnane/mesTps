package cigma.pfe.repositories;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
public class ClientRepositoryImpl implements ClientRepository{
	
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em=emf.createEntityManager();
	
	public ClientRepositoryImpl() {
		System.out.println("Call ClientRepositoryImpl ....");
	}
	
	@Override
	public Client save(Client c) {
	System.out.println("DAO Layer : ClientRepositoryImpl Level");
	
	em.getTransaction().begin();
	em.persist(c);
	em.getTransaction().commit();
	
	return null;
	}

	@Override
	public Client update(Client c) {
		em.getTransaction().begin();
		//from database
		Client client = em.find(Client.class, c.getId());
		client.setName("hhhh");//c.getName()
		em.persist(client);
		em.getTransaction().commit();
		return client;
	}
	
	@Override
	public void deleteById(long idClient) {
	em.getTransaction().begin();
	Client clientInDataBase = em.find(Client.class,idClient);
	em.remove(clientInDataBase);
	em.getTransaction().commit();
	}
	@Override
	public Client findById(long idClient) {
	return em.find(Client.class,idClient);
	}
	/*FACTURE*/
	

    @Override
    public Facture create(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public List<Facture> read() {
        List<Facture> Read2 = em.createQuery("select e from TFactures e").getResultList();
        return Read2;
    }

    @Override
    public void deleteFactureById(long id) {

        em.getTransaction().begin();
        Facture clientInDataBase = em.find(Facture.class,id);
        em.remove(clientInDataBase);
        em.getTransaction().commit();

    }
    @Override
    public Facture updates(Facture f) {
        em.getTransaction().begin();
        Facture currentFacture = em.find(Facture.class,f.getId());
        currentFacture.setDate(f.getDate());
        
        em.persist(currentFacture);
        em.getTransaction().commit();
        return null ;
    }
	

	
}
