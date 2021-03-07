package fr.univ_smb.iae.mtii.m1.appliRunning;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Si implements ActionListener {

	private static JFrame Frame;
	private static JPanel Panel;
	private static JLabel Label, Label2, Label3, Label4, Label5, Label6, Label7, Label8;
	private static JButton Button;

	
	
	public static void main(String[] args) throws Exception{

		// Informations pour renvoyer de la donnée dans l'interface graphique
Athlete a1 = new Athlete();
a1.setNom("Adrien");
a1.setPrenom("Flavien");
Chaussure c1 = new Chaussure();
c1.setMarque("adidas");
a1.getChaussures().add(c1);
	
Manager m1 = new Manager();
m1.setNom("Fred");
m1.setPrenom("Jean");
m1.setManage(a1);
m1.athleteManage();
a1.setShoe(c1);
a1.displayShoes();
		
		Panel = new JPanel();
		Frame = new JFrame();
		Frame.setSize(300, 300);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Frame.add(Panel);
		
		Panel.setLayout(null);
		
		Label = new JLabel("Système d'informations d'athlète");
		Label.setBounds(10, 20, 250, 25);
		Panel.add(Label);
						
		Label2 = new JLabel("Nom :");
		Label2.setBounds(10, 30, 150, 100);
		Panel.add(Label2);
		
		Label5 = new JLabel(a1.getNom());
		Label5.setBounds(75, 68, 250, 25);
		Panel.add(Label5);

		
		Label3 = new JLabel("Prénom :");
		Label3.setBounds(10, 80, 150, 100);
		Panel.add(Label3);
		
		Label6 = new JLabel(a1.getPrenom());
		Label6.setBounds(75, 118, 250, 25);
		Panel.add(Label6);
		
		Label7 = new JLabel("Manager :");
		Label7.setBounds(10, 110, 150, 100);
		Panel.add(Label7);
		
		Label8 = new JLabel(m1.getNom() + " "+ m1.getPrenom());
		Label8.setBounds(75, 148, 250, 25);
		Panel.add(Label8);
		
		Button = new JButton("Fermer la fenêtre");
		Button.setBounds(90, 190, 130, 25);
		Button.addActionListener(new Si());
		Panel.add(Button);
		
		Label4 = new JLabel("");
		Label4.setBounds(110, 220, 150, 25);
		Panel.add(Label4);
		
		Frame.setVisible(true);
		
		System.out.print("\n L'appli Fonctionne !");
	
		
	}


	
	public void actionPerformed(ActionEvent e) {
		
		Frame.dispose();
		
	}

}
