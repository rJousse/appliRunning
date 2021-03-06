package appliRunning;

public class Course {

	private String lieu, organisateur;
	private double distance;
	private boolean inscrit;
	private int classement;
	
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getOrganisateur() {
		return organisateur;
	}
	public void setOrganisateur(String organisateur) {
		this.organisateur = organisateur;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public boolean isInscrit() {
		return inscrit;
	}
	public void setInscrit(boolean inscrit) {
		this.inscrit = inscrit;
	}
	
	public int getClassement() {
		return classement;
	}
	public void setClassement(int classement) {
		this.classement = classement;
	}
	
	public int nbInscriptions() {
		int i = 0;
		if( this.inscrit = true) {
			i = i++;
		}
		else {
			i = i + 0;
		}
		System.out.print("\n l'athlete est inscrit à " + i + " courses");
		return i;
	}
}
