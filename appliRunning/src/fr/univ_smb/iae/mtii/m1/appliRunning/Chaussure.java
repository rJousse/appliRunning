package fr.univ_smb.iae.mtii.m1.appliRunning;


public class Chaussure {

	private int poids;
	private String marque;
	private int nbKilometres;
	
	
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getNbKilometres() {
		return nbKilometres;
	}
	public void setNbKilometres(int nbKilometres) {
		this.nbKilometres = nbKilometres;
	}
	
	
	public String afficherMarque() {
		System.out.print(this.marque);
		return marque;
	}
	
	public int afficherKilometrage() {
		System.out.print(this.nbKilometres);
		return this.nbKilometres;
	}
	
	public int addKilometres(int k) {
		this.nbKilometres = this.nbKilometres + k;
		return this.nbKilometres;
	}
	

}

