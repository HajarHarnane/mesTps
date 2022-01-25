package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TClients")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	@OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private List<Facture> factures;
	
	public Client(String name) {
		this.name = name;
	}
	
	public Client(long id,String name) {
		this.id = id;
		this.name = name;
	}
	@ManyToMany(cascade = {CascadeType.PERSIST})
	@JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
			name = "client_fk",
			referencedColumnName = "id"
			),
			inverseJoinColumns = @JoinColumn(
			name = "promotion_fk",
			referencedColumnName = "id"
			))

	private List<Promotion> promotions;

	@OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private CarteFidelio carteFidelio;
	
	

	
	

	
	
	
	
	
}