package fr.univ_smb.iae.mtii.m1.appliRunning;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import fr.univ_smb.iae.mtii.m1.appliRunning.Chaussure;

@SuppressWarnings("unused")
class TestaddKilometres {

	void testaddKilometres() {
		// Arrange
		int a = 30;
		Chaussure c = new Chaussure();

		// Act
		int somme = c.addKilometres(a);

		// Assert
		assertEquals(30, somme);
	}
}
