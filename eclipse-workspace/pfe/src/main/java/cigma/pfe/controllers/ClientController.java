package cigma.pfe.controllers;
import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientServiceImpl;

import cigma.pfe.models.Facture;
import java.util.List;

public class ClientController {
	ClientService clientService;/*= new ClientServiceImpl();*/
	
	public ClientController() {
		System.out.println("Call ClientController ....");
	}

	public Client save(Client c ){
	System.out.println("ClientController level...");
	return clientService.save(c);
	}
	
	public void setClientService(ClientService clientService) {
		
		this.clientService=clientService;
	}
	public ClientController(ClientService clientService) {
		System.out.println("Call ClientController with clientService param....");
		this.clientService=clientService;
	}

	/*public void setService(ClientService clientService)
	{
		this.clientService=clientService;
	}
	public ClientService getService()
	{
		return clientService;
	}
	public ClientController(){
		System.out.println("creation d'un objet client controler");
	}*/

	public void modify(Client c){
		clientService.modify(c);
	}
	public void removeById(long id){
		clientService.removeById(id);
	}
	public Client getById(long id){
		return clientService.getById(id);
	}
	
	
	
	
	
	
	
	//FACTURE
	/*
    public Facture create(Facture f){
        return clientService.create(f);
    }
    public List<Facture> read(){
        return clientService.read();
    }
    public void delete(long id){
        clientService.delete(id);
    }
    public Facture update(Facture f){
    return  clientService.update(f);
    }*/
	
}