package cigma.pfe.services;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;

import cigma.pfe.models.Facture;
import java.util.List;

public class ClientServiceImpl implements ClientService{
	ClientRepository clientRepository;/*= new ClientRepositoryImpl();*/
	public ClientServiceImpl() {
		System.out.println("Call ClientServiceImpl ....");
				
	}

	@Override
	public Client save(Client c) {
	System.out.println("Service Layer : ClientServiceImpl Level... ");
	return clientRepository.save(c);
	}
	
	public ClientServiceImpl(ClientRepository clientRepository) {
		System.out.println("Call ClientServiceImpl with ClientRepository param....");
		this.clientRepository = clientRepository;
	}
	@Override
	public Client modify(Client c) {
		return clientRepository.update(c);
	}
	@Override
	public void removeById(long id) {
	clientRepository.deleteById(id);
	}
	@Override
	public Client getById(long id) {
	return clientRepository.findById(id);
	}
	
	/*FACTURE*/
	

    @Override
    public Facture create(Facture f){
        return clientRepository.create(f);
    }

    @Override
    public List<Facture> read(){
        return clientRepository.read();
    }
    @Override
    public void delete(long id){
        clientRepository.deleteFactureById(id);
    }

    @Override
    public Facture update(Facture f) {
        return clientRepository.updates(f);
    }
	
	







}

