package biblio.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "emprunt")
public class Emprunt {
	@Id
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client cli;
	
	@ManyToMany(mappedBy="emprunt")
	private Set<Livre> livre;
	
	@Column(name = "DATE_DEBUT")
	private LocalDate dateDebut;
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	
	@Column(name ="DELAI")
	private int delai;

	public Emprunt() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	public Client getCli() {
		return cli;
	}

	public void setCli(Client cli) {
		this.cli = cli;
	}

	public Set<Livre> getLivre() {
		return livre;
	}

	public void setLivre(Set<Livre> livre) {
		this.livre = livre;
	}

}
