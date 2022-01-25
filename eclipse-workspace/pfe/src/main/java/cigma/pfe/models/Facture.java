package cigma.pfe.models;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@ToString

public class Facture {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String amount;
private String description;
@ManyToOne
@JoinColumn(name = "client_id")
private Client client;
public Facture() {
}
public Facture(String amount,String description) {
	this.amount=amount;
	this.description=description;
}
public String getAmount() {
return amount;
}
}































		//Exercice tp8_faacture_10pts

/*import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "TFactures")
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private Date date;
	@Column
	private double amount;

	public Facture() {
	}

	public Facture(Date date, double amount) {
		this.date = date;
		this.amount = amount;
	}

	public long getId() {

		return id;
	}

	public Date getDate() {
		// TODO Auto-generated method stub
		return date;
	}

	public void setDate(Date date2) {
		// TODO Auto-generated method stub
		date = date2;
	}

}*/