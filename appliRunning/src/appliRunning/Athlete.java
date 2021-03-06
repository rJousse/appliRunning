package appliRunning;

public class Athlete {

	private int age, poids;
	private String nom, prenom;
	private Manager estManage;
	private Course estInscrit;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
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
	
	public String afficherInfos() {
		System.out.print(this.nom + this.prenom + " est agé de " + this.age + " et pèse " + this.poids + "kg" + "\n");
		return nom;
	}
	public Manager getEstManage() {
		return estManage;
	}
	public void setEstManage(Manager estManage) {
		this.estManage = estManage;
	}
	public Course getEstInscrit() {
		return estInscrit;
	}
	public void setEstInscrit(Course estInscrit) {
		this.estInscrit = estInscrit;
	}
	
}
