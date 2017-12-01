package ie.lyit.testers;
import ie.lyit.hotel.Employee;
import ie.lyit.hotel.Date;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private Employee e;
	@Before
	public void setUp() throws Exception {
		e=new Employee("Ms","Lisa","Simpson","High Rd",
				 "0860987653",20,12,1992,new Date(1,1,2009),25000);
	}

	@Test
	public void testGetDateProbationEnds() {
		assertEquals(e.getDateProbationEnds(30), new Date (31,1,2009));
		assertEquals(e.getDateProbationEnds(50), new Date (22,2,2009));
	}

}
