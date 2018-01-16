package banque.model;

import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name = "banque")
public class Banque {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_BANQUE", unique=true)
	private int id;
	@Column(name = "NOM_BANQUE", length = 30)
	private String nom;
	@OneToMany(mappedBy = "banque")
	private Set<Client> client;

	public Banque() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Client> getClient() {
		return client;
	}

	public void setClient(Set<Client> client) {
		this.client = client;
	}

}
