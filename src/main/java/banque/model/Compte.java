package banque.model;

import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name = "compte")
public class Compte {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_COMPTE")
	private int id;
	@Column(name = "NUM_COMPTE")
	private long numero;
	@Column(name = "SOLDE_COMPTE")
	private int solde;
	@OneToMany (mappedBy="compte")
	private Set <Operation> ope;
	@ManyToMany
	@JoinTable(name="client_compte",joinColumns= @JoinColumn(name="ID_COMPTE", referencedColumnName="ID_COMPTE"),
	inverseJoinColumns= @JoinColumn(name="ID_CLIENT", referencedColumnName="ID_CLIENT"))
	private Set <Client> listeClient;
	
	public Compte() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public Set<Operation> getOpe() {
		return ope;
	}

	public void setOpe(Set<Operation> ope) {
		this.ope = ope;
	}

	public Set<Client> getListeClient() {
		return listeClient;
	}

	public void setListeClient(Set<Client> listeClient) {
		this.listeClient = listeClient;
	}

}
