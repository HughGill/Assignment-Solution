package ie.lyit.testers;
import ie.lyit.hotel.Date;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTest {
	private Date d, d1;
	@Before
	public void setUp() throws Exception {
		d=new Date();
	}

	@Test
	public void testDate() {
		
		// Check d1’s day is 0
		assertEquals(d.getDay(), 0);
		// Check d1’s month is 0, if it is not display appropriate message
		 assertEquals("Month should be 0", d.getMonth(), 0);
		// Check d1’s year is 5, if it is not display appropriate message
		// NOTE : This should fail!
		assertEquals("Year should be 0", d.getYear(), 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDateIntIntInt() {
		d1 = new Date(32,13,1850);
	}

	@Test
	public void testSetDay() {
		d.setDay(21);
		assertEquals(d.getDay(),21);
	}

	@Test
	public void testSetMonth() {
		d.setMonth(6);
		assertTrue(d.getMonth()==6);
	}

	@Test
	public void testSetYear() {
		d.setYear(1900);
		assertEquals(d.getYear(),1900);
	}

}
