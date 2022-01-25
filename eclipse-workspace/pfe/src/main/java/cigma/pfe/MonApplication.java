package cigma.pfe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.Promotion;

import java.util.List;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;




/*import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;*/

public class MonApplication {
	
	
	public static void main(String[] args) {	
		
		/*ClientController ctrl1 = new ClientController();
		Client client =new Client(1L,"testing");
		ctrl1.save(client);*/
		
		
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrl = (ClientController) context.getBean("controller");
		Client client = new Client("omar");
		/*List<Facture> factures = Arrays.asList(new Facture("1500.0","facture1"),new
				Facture("2000.0","facture2"));
		client.setFactures(factures);*/
		/*List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new
				Promotion("solde 40%"));
		client.setPromotions(promotions);*/
		CarteFidelio carteFidelio = new CarteFidelio("A29930489");
		carteFidelio.setClient(client);
		client.setCarteFidelio(carteFidelio);

		ctrl.save(client);
		/*client.setFactures(factures);
		ctrl.save(client);
		ctrl.save(new Client("SIHAM"));
		ctrl.save(new Client("AHMED"));
		ctrl.save(new Client("FARAH"));
		ctrl.save(new Client("ssss"));
		// Test modify use case for client with id==1
		ctrl.modify(new Client(1,"new Name"));
		// Test remove use case for client with id==1
		ctrl.removeById(10);
		ctrl.removeById(11 );
		ctrl.removeById(12);
		ctrl.removeById(13);
		// Test find use case for client with id==1
		Client found = ctrl.getById(4);*/
		
		
		
		
		
		
		
		
		

		/*ClientController ctr=(ClientController)ctx.getBean("idCtrl");
		System.out.print(ctr.getService());*/
		
		//FACTURE
		 
		/*ctrl.create(new Facture(new Date("2022, 02, 11"),100));   
		ctrl.read();
        ctrl.delete(8);
        ctrl.update(new Facture(new Date("2022-02-29"),23.00));*/

	}
}
