package appliRunning;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Si implements ActionListener {

	private static JFrame Frame;
	private static JPanel Panel;
	private static JLabel Label, Label2, Label3, Label4;
	private static JTextField Field, Field2;
	private static JButton Button;
	
	
	public static void main(String[] args) {
Athlete a1 = new Athlete();
Chaussure c1 = new Chaussure();

a1.setNom("Josh");
		c1.setNbKilometres(250);
		c1.addKilometres(25);
		c1.afficherKilometrage();
		
		Course cs = new Course();
		cs.setInscrit(true);
		cs.nbInscriptions();
		
		Manager m1 = new Manager();
		m1.setManage(a1);

		m1.athleteManage();
		
		
		Panel = new JPanel();
		Frame = new JFrame();
		Frame.setSize(400, 600);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Frame.add(Panel);
		
		Panel.setLayout(null);
		
		Label = new JLabel("Système de gestion d'athlète");
		Label.setBounds(10, 20, 250, 25);
		Panel.add(Label);
		
		Label2 = new JLabel("Nom");
		Label2.setBounds(10, 20, 150, 100);
		Panel.add(Label2);
		
		
		Field = new JTextField(20);
		Field.setBounds(70, 60, 150, 25);
		Panel.add(Field);
		
		Label3 = new JLabel("Prénom");
		Label3.setBounds(10, 100, 150, 100);
		Panel.add(Label3);
		
		
		Field2 = new JTextField(20);
		Field2.setBounds(70, 138, 150, 25);
		Panel.add(Field2);
		
		Button = new JButton("M'inscrire");
		Button.setBounds(90, 190, 130, 25);
		Button.addActionListener(new Si());
		Panel.add(Button);
		
		Label4 = new JLabel("");
		Label4.setBounds(110, 220, 150, 25);
		Panel.add(Label4);
		
		Frame.setVisible(true);
		
		System.out.print("L'appli Fonctionne !");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		String prenom = Field2.getText();
		
		if (prenom.equals("")) {
		Label4.setText("Écrivez votre nom");
		}
		else {
			Label4.setText("Vous êtes inscrit !");
		}
		
	}

}
