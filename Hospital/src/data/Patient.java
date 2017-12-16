package data;

public class Patient {
	private String name;
	private String surname;
	private int PESEL;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getPESEL() {
		return PESEL;
	}
	public void setPESEL(int pes) {
		PESEL = pes;
	}
	
	@Override
	public String toString() {
		String string = "Name: " + this.name + "\nSurname: " + this.surname + "\nPESEL: " + this.PESEL;
		return string;
	}
}