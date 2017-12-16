package app;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.Hospital;

public class HospitalApp {
	private static int userChoice = -1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Hospital hospital = new Hospital();

		while (userChoice != 0) {
			System.out.println("What do you want to do?\n");
			System.out.println("0.Exit program");
			System.out.println("1.Sign up patient");
			System.out.println("2.Display list of patients");
			try {
				userChoice = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Input is not a number!\n");
				throw new InputMismatchException();
			}

			switch (userChoice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				hospital.addPatient();
				break;
			case 2:
				System.out.println(hospital.getPatients());
				break;
			default:
				System.out.println("Unknown command, please try again!\n");
				break;
			}
		}
	}
}