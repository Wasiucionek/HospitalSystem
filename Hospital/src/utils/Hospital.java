package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import data.Patient;

public class Hospital {

	List<Patient> listOfPatients = new ArrayList<>();

	public void addPatient() {
		if (listOfPatients.size() < 10) {
			Scanner scanner = new Scanner(System.in);
			Patient patient = new Patient();

			System.out.println("Enter name: ");
			String nameInput = scanner.nextLine();
			patient.setName(nameInput);

			System.out.println("Enter surname: ");
			String surnameInput = scanner.nextLine();
			patient.setSurname(surnameInput);

			System.out.println("Enter PESEL: ");
			try {
				int PESEL = scanner.nextInt();
				patient.setPESEL(PESEL);
			} catch (InputMismatchException e) {
				System.out.println("PESEL must be a number!\n");
			}
			listOfPatients.add(patient);
		} else {
			System.out.println("Cannot sign up more patients!\n");
		}
	}

	public void addPatient(Patient patient) {
		listOfPatients.add(patient);
	}

	public String getPatients() {
		for (Patient temp : listOfPatients) {
			return Arrays.toString(listOfPatients.toArray());
		}
		return null;
	}
}