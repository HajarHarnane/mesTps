package cigma.pfe.repositories;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;

import java.util.List;
public interface ClientRepository {
	Client save(Client c);
	Client update(Client c);
	void deleteById(long idClient);
	Client findById(long idClient);
	
	//FACTURE
	
	/*Facture create(Facture f);
	List<Facture> read();
	void deleteFactureById(long id);
	Facture updates(Facture f);*/
}