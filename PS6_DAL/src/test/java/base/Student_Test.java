package base;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import junit.framework.TestCase;
import util.HibernateUtil;
import base.PersonDAL;
import base.StudentDAL;

public class Student_Test {
	
	private static  PersonDomainModel person1;
	private static  PersonDomainModel person2;
	private static  PersonDomainModel person3;
	private static  PersonDomainModel person4;
	static UUID Person1UUID;
	static UUID Person2UUID;
	static UUID Person3UUID;
	static UUID Person4UUID; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		person1 = new PersonDomainModel();
		person1.setPersonID(UUID.randomUUID());
		person1.setFirstName("Mohammad");
		person1.setLastName("Baksh");
		person1.setMiddleName("Mamdoh");
		
		//person1.setDOB();
		person1.setStreet("264 S Main st");
//		person1.setCity("Newark");
		person1.setPostalCode(197117);
//		
//		person2 = new PersonDomainModel(); 
//		person2.setFirstName("Mohammad");
//		person2.setLastName("Al-Fashike");
//		person2.setStreet("221 Murray Rd");
//		person2.setCity("Delware");
//		person2.setPostalCode(19711);
//		
//		person3 = new PersonDomainModel(); 
//		person3.setFirstName("Sarah");
//		person3.setLastName("Al-Saud");
//		person3.setStreet("500 Boylston st.");
//		person3.setCity("Mass");
//		person3.setPostalCode(02446);
//		
//		person4 = new PersonDomainModel(); 
//		person4.setFirstName("Hyfaa");
//		person4.setLastName("Al-Saud");
//		person4.setStreet("20 pine st.");
//		person4.setCity("New York");
//		person4.setPostalCode(10005);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddPerson() {
		PersonDAL.addPerson(person1);
//		PersonDAL.addPerson(person2);
//		PersonDAL.addPerson(person3);
		
		assertTrue(person1 == person1);
//		assertTrue(person2 == person3);
//		assertTrue(person3 == person3);
	}
//	@Test
//	public void testDeletePerson() {
//		PersonDAL.deletePerson(Person1UUID);
//		PersonDAL.deletePerson(Person2UUID);
//		PersonDAL.deletePerson(Person3UUID);
//		
//		assertTrue(PersonDAL.deletePerson(Person1UUID) == PersonDAL.deletePerson(Person1UUID));
//		assertTrue(PersonDAL.deletePerson(Person2UUID) == null);
//		assertTrue(PersonDAL.deletePerson(Person3UUID) == null);
//	}
//	
//	@Test
//	public void testUpdatePerson() {
//		PersonDAL.updatePerson(person1.FirstName("Brittany"));
//		assertTrue((PersonDAL.getPerson(Person1UUID) == person1));
//	}
//	
//	@Test
//	public void testGetPerson() {
//		
//		assertTrue(PersonDAL.updatePerson(person1) == session.update(person1));
//	}

}
