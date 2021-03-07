package fr.univ_smb.iae.mtii.m1.appliRunning;

import java.util.LinkedList;

public class Athlete {

	private int age, poids;
	private String nom, prenom;
	private Manager estManage;
	private Course estInscrit;
	private Chaussure shoe;

	private LinkedList<Chaussure> Chaussures = new LinkedList<Chaussure>();
	
	public LinkedList<Chaussure> displayShoes() {
		System.out.println("\nc'est une chaussure " + shoe.getMarque() + " que l'athlète porte. \n");
		return this.Chaussures;
	}

	private LinkedList<Course> Courses = new LinkedList<Course>();
	
	public LinkedList<Course> displayCourses() {
		System.out.println("\nl'athlète est inscrit aux courses suivantes : " + estInscrit.getLieu());
		return Courses;
	}
	
	public LinkedList<Course> getCourses() {
		return Courses;
	}

	public void setCourses(LinkedList<Course> courses) {
		Courses = courses;
	}

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
	
	public Chaussure getShoe() {
		return shoe;
	}


	public void setShoe(Chaussure shoe) {
		this.shoe = shoe;
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
	public LinkedList<Chaussure> getChaussures() {
		return Chaussures;
	}
	public void setChaussures(LinkedList<Chaussure> chaussures) {
		Chaussures = chaussures;
	}
	
}
