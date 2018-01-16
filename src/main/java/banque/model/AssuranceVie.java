package banque.model;

import java.time.LocalDate;

import javax.persistence.*;

public class AssuranceVie extends Compte{

	@Column(name = "TX")
	private double taux;
	@Column(name = "DATEFIN_ASSU_VIE")
	private LocalDate dateFin;
	
	public AssuranceVie() {
		// TODO Auto-generated constructor stub
		super();
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

}
