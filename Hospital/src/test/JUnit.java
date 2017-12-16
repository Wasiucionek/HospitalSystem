package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import data.Patient;
import utils.Hospital;

public class JUnit {

	@Test
	public void testAddPatient() {	
		Scanner scanner = new Scanner(System.in);
		Hospital hospital = new Hospital();

		Patient patient = new Patient();
		patient.setName("Jan");
		patient.setSurname("Kowalski");
		patient.setPESEL(123456789);
		
		hospital.addPatient(patient);
		
		final List<Patient> expected = new ArrayList<>();
		expected.add(patient);
		
		Assert.assertEquals(Arrays.toString(expected.toArray()), hospital.getPatients());		
	}
}