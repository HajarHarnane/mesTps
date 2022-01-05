package cigma.pfe.controllers;
import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientServiceImpl;

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
	
}