package fr.univ_smb.iae.mtii.m1.appliRunning;

import java.util.LinkedList;

public class Manager {

	private String nom, prenom;
	private int age;
	private Athlete manage;
	
	private LinkedList<Athlete> Athletes = new LinkedList<Athlete>();
	
	public LinkedList<Athlete> displayClients(){
		System.out.println("\nLe manager gère les athlètes suivants : " + manage.getNom());
		return Athletes;
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
		System.out.print(this.nom + " " + this.prenom + " est le manager de l'athlète nommé " + this.manage.getNom());
		return nom;
	}
}
