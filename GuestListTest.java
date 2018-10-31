import static org.junit.Assert.*;

import org.junit.Test;

public class GuestListTest {

	@Test
	public void getCount() {

		GuestList guestList = new GuestList();

		guestList.add("Tim", 103, false);
		int actual = guestList.getCount();

		int expected = 1;
		assertEquals(expected, actual);
		
	}
	@Test
	public void getCount1() {

		GuestList guestList = new GuestList();

		guestList.add("David", 103, false);
		int actual = guestList.getCount();

		int expected = 1;
		assertEquals(expected, actual);
		
	}
	@Test
	public void getMemberCount1() {

		GuestList guestList = new GuestList();
		guestList.add("Pops", -13, true);

		int actual = guestList.getMemberCount();

		int expected = 1;
		assertEquals(expected, actual);
		
	}
	@Test
	public void getMemberCount2() {

		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		guestList.add("Tim", 103, false);
		guestList.add("Tim", 103, true);

		int actual = guestList.getMemberCount();

		int expected = 1;
		assertEquals(expected, actual);
		
	}
	@Test
	public void getMemberAge() {
		
		GuestList guestList = new GuestList();
		guestList.add("Tim", 3, false);
		
		int actual = guestList.getSum();
		
		int expected = 3;
		assertEquals(expected, actual);
	}
	@Test
	public void getMemberAge2() {
		
		GuestList guestList = new GuestList();
		guestList.add("David", 13, true);
		guestList.add("Tim", 74, false);
		
		int actual = guestList.getSum();
		
		int expected = 87;
		assertEquals(expected, actual);
	}
}
