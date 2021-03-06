package appliRunning;

public class Manager {

	private String nom, prenom;
	private int age;
	private Athlete manage;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Athlete getManage() {
		return manage;
	}
	public void setManage(Athlete manage) {
		this.manage = manage;
	}
	
	public String athleteManage() {
		System.out.print(this.nom + " est le manager de l'athlète nommé ");
		return nom;
	}
}
