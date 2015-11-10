package domain;


import java.time.LocalDate;
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

import util.LocalDateAdapter;


public class PersonDomainModel {

	private UUID PersonID; 
    private  String FirstName;
	private  String MiddleName; 
	private  String LastName;
    private  String street;
    private  int postalCode;
    private  String city;
    private  ObjectProperty<LocalDate> DOB;
	

    /**
     * Default constructor.
     */
	// UUID 
	public UUID getPersonID() {
		return PersonID;
	}

	public void setPersonID(UUID personID) {
		PersonID = personID;
	}
	// FirstName 
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String firstNameProperty() {
        return FirstName;
    }
    
    // MiddleName 
    public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	// LastName 
	
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String lastNameProperty() {
        return LastName;
    }
    
    // Street 

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String streetProperty() {
        return street;
    }
    
    // Postal Code 
    
    public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
    
    // City 

    public String getCity() {
        return city;
    }


	public void setCity(String city) {
        this.city = city;
    }

    public String cityProperty() {
        return city;
    }
    
    // DOB 

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getBirthday() {
        return DOB.get();
    }

    public void setBirthday(LocalDate birthday) {
        this.DOB.set(birthday);
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return DOB;
    }
    
    public ObjectProperty<LocalDate> getDOB() {
		return DOB;
	}

	public void setDOB(ObjectProperty<LocalDate> dOB) {
		DOB = dOB;
	}


}