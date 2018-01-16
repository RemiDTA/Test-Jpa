package banque.model;

import java.time.LocalDate;

import javax.persistence.*;
@Entity
@Table(name = "operation")
public class Operation {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_CLIENT")
	private int id;
	@Column(name = "DATE_OP")
	private LocalDate date;
	@Column(name = "MONTANT_OP")
	private int montant;
	@Column(name = "MOTIF_OP", length = 30)
	private String motif;
	@ManyToOne
	private Compte compte;

	public Operation() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}
