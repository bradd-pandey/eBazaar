package waa.project.domain;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;



@Entity(name = "USER") 
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotBlank
	@Size(min=4,max=50,message="First Name should be in between 4 and 50 characters")
	private String firstName;
	
	@NotBlank
	@Size(min=4,max=50,message="First Name should be in between 4 and 50 characters")
	private String lastName;
	
	@NotEmpty
 	private String gender = null;
	
	@Valid
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Login login;
		
	@Valid
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Phone phone;
	
	@Transient
  	private Date birthDate;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@Valid
	private Address userAddress;
	
	@NotEmpty
	private String email;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
		
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	
	public Address getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	
	

}
