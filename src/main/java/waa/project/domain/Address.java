package waa.project.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Address implements Serializable{
	
	/**
	 * 
	 */
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	private static final long serialVersionUID = 1L;
	
	private String street;

	private String city;

	private String state;	

	private String zipcode;

	private String country;
	
	Address(){
		
	}	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String street, String state, String city, String zipcode, String country) {
		
		this.street = street;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", city=" + city + ", zipcode=" + zipcode
				+ ", country=" + country + "]";
	}
	
	
	
	

}
