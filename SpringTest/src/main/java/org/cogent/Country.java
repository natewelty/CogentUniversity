package org.cogent;


import org.springframework.stereotype.Component;

@Component("country")
public class Country {
	int countryID;
	String countryName;
	
	
	public Country(int countryID, String countryName) {
		super();
		this.countryID = countryID;
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Country [countryID=" + countryID + ", countryName=" + countryName + "]";
	}
	public int getCountryID() {
		return countryID;
	}
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
}
