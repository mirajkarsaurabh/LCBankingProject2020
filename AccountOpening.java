package com.model;

public class AccountOpening {

	private String FirstName;
	private String LastName;
	private String Gender;
	private String DateOfBirth;
	private int Age;
	private String AccountType;
	private String Branch;
	private String MobileNumber;
	private String Email;
	private String Occupation;
	private String AadharNumber;
	private String PanNumber;

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public String getAadharNumber() {
		return AadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		AadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return PanNumber;
	}

	public void setPanNumber(String panNumber) {
		PanNumber = panNumber;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	@Override
	public String toString() {
		return "AccountOpening [FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender
				+ ", DateOfBirth=" + DateOfBirth + ", Age=" + Age + ", AccountType=" + AccountType + ", Branch="
				+ Branch + ", MobileNumber=" + MobileNumber + ", Email=" + Email + ", Occupation=" + Occupation
				+ ", AadharNumber=" + AadharNumber + ", PanNumber=" + PanNumber + "]";
	}	
}	