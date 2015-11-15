package domain;


import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import base.PersonDAL;
import util.LocalDateAdapter;


public class PersonDomainModel {

	protected UUID PersonID; 
    protected  String firstName;
    protected  String middleName; 
    protected  String lastName;
    protected  String street;
    protected  int postalCode;
    protected  String city;
    protected  Date birthday;



    /**
     * Default constructor.
     */
    public PersonDomainModel()
    {
    	this.PersonID = UUID.randomUUID();
    	this.postalCode = 0;
    } 
//    public PersonDomainModel(UUID FirstName , String firstName, String MiddleName,  String lastName, String street, int postalCode, String city, Date dob){
//    	this.PersonID = UUID.randomUUID();
//    	this.firstName = firstName;
//    	this.middleName = MiddleName;
//    	this.lastName = lastName;
//    	this.street = street;
//    	this.postalCode = postalCode;
//    	this.city = city;
//    	this.birthday = dob;
//    }

	// UUID 
    public void setPersonID(UUID personID) {
  		PersonID = personID;
  	}

  	public void setPostalCode(Integer postalCode) {
  		this.postalCode = postalCode;
  	}

  	public UUID getPersonID()
      {
      	return this.PersonID;
      }
	// FirstName 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName =firstName;
    }
    
    // MiddleName 
    public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		middleName = middleName;
	}
	// LastName 
	
	 public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName=lastName;
	    }

    
    // Street 

	    public String getStreet() {
	        return street;
	    }

	    public void setStreet(String street) {
	        this.street=street;
	    }
    
    // Postal Code 
    
	    public int getPostalCode() {
	        return postalCode;
	    }

	    public void setPostalCode(int postalCode) {
	        this.postalCode=postalCode;
	    }

    // City 

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city=city;
	    }


    
    // DOB 
	    public Date getBirthday() {
	        return birthday;
	    }

	    public void setBirthday(Date birthday) {
	        this.birthday=birthday;
	    }




}