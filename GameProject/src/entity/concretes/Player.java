package entity.concretes;

import entity.abstracts.Entity;

public class Player implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private int birthOfYear;
	private String nationalIdentity;
	
	
	
	
	
	public Player() {
	}



	public Player(int id, String firstName, String lastName, int birthOfYear, String nationalIdentity) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfYear = birthOfYear;
		this.nationalIdentity = nationalIdentity;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public int getBirthOfYear() {
		return birthOfYear;
	}





	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}





	public String getNationalIdentity() {
		return nationalIdentity;
	}





	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	public String toString() {
		 return "Player{" +
	                "id=" + id +
	                ", firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", birthOfYear=" + birthOfYear +
	                ", nationalIdentity='" + nationalIdentity + '\'' +
	                '}';
		
	}
	
	
	

}
