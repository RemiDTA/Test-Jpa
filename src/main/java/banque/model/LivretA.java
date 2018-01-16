package banque.model;

import javax.persistence.*;

public class LivretA extends Compte{

	@Column(name = "TX")
	private double taux;
	public LivretA() {
		// TODO Auto-generated constructor stub
		super();
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}

}
