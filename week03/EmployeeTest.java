package week03;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Hope
 * Date: 15 May 2021
 */

public class EmployeeTest {
	/**
	 * Default constructor
	 */
    @Test
    public void testEmployee() {
    	// note: this("New First", "New Last");
    	Employee employee = new Employee();
    	String expectedFirst = employee.getFirstName();
    	String expectedLast = employee.getLastName();
    	
        assertEquals("New First", expectedFirst);
        assertEquals("New Last", expectedLast);
    }

    /**
     * Overloaded constructor
     */
    @Test
    public void testEmployeeStringString() {
    	// note: this(first, last);
        Employee employee = new Employee("first", "last");
        String expectedFirst = employee.getFirstName();
        String expectedLast = employee.getLastName();
        double expectedSalary = employee.getSalary();
        
        assertEquals("first", expectedFirst);
        assertEquals("last", expectedLast);
        assertEquals(0.0, expectedSalary, 0.00001);
    }

    /**
     * Parameterized constructor
     */
    @Test
    public void testEmployeeStringStringDouble() {
        Employee employee = new Employee("first", "last", 0.0);
        String expectedFirst = employee.getFirstName();
        String expectedLast = employee.getLastName();
        double expectedSalary = employee.getSalary();
        
        assertEquals("first", expectedFirst);
        assertEquals("last", expectedLast);

        assertEquals(0.0, expectedSalary, 0.00001);
    }

    @Test
    public void setFirstName() {
    	Employee employee = new Employee();
    	String firstExpected = employee.getFirstName();
    	assertEquals("New First", firstExpected);
    }

    
    @Test
    public void setLastName() {
    	Employee employee = new Employee();
    	String lastExpected = employee.getLastName();
    	assertEquals("New Last", lastExpected);
    }

    @Test
    public void testSetSalary() {
    	Employee employee = new Employee();
    	employee.setSalary(0.1);
    	assertEquals(0.1, 0.1, 0.001);
    }

    @Test
    public void testDisplayName() {
    	Employee employee = new Employee();
    	String nameExpected = employee.getDisplayName();
    	assertEquals("New Last, New First", nameExpected);
    }

    @Test
    public void testGetFormattedSalary() {
    	Employee employee = new Employee();
    	String salaryFormatExpected = employee.getFormattedSalary();
    	assertEquals("0.00", salaryFormatExpected);
    }

    @Test
    public void testEqualsObject() {
    	// testing two objects
    	Employee employee1 = new Employee();
    	Employee employee2 = new Employee();
    	boolean equalsExpected = employee1.equals(employee2);
    	assertEquals(true, equalsExpected);
    }

    @Test
    public void testToString() {
    	Employee employee = new Employee();
    	String stringExpected = employee.toString();
    	assertEquals("New Last, New First Salary: $0.00", stringExpected);
    }
    
//    @Test
//    public void hashCode() {
//    	
//    }

}