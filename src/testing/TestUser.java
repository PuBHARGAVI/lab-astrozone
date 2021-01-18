package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import model.User;

public class TestUser {
	User astro = new User("Clara","clara@gmail.com","03-11-1997", "female");
	@Test
	public void testGetNameMethod() {
		astro.setName("Clara");
                astro.setEmail("clara@gmail.com");
		astro.setGender("Female");
		astro.setDob("03-11-1997");
		assertEquals("Clara", astro.getName());
                assertEquals("clara@gmail.com", astro.getEmail());
		assertEquals("Female",astro.getGender());
		assertEquals("03-11-1997",astro.getDob());
		try {
			astro.setName(null);
                        astro.setEmail(null);
			astro.setGender(null);
			astro.setDob(null);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
