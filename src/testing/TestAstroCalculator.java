package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import model.User;
import service.AstroCalculator;

public class TestAstroCalculator {	
	AstroCalculator astrocal = new AstroCalculator();
	@Test
	public void testFindSignMethod() {
		User astro = new User("Clara", "clara@gmail.com", "03-11-1997", "female");
		assertEquals("Scorpio",astrocal.findSign(astro));
		User astro1 = new User("Clara", "clara@gmail.com", "04-04-1969", "female");
		assertEquals("Aries",astrocal.findSign(astro1));
		try {
			User astro2 = new User(null,null,null, null);
			astrocal.findSign(astro2);
			User astro3 = new User(null,"clara@gmail.com","03-11-1997", "female");
			astrocal.findSign(astro3);
			User astro4 = new User("Clara",null,"03-11-1997", "female");
			astrocal.findSign(astro4);
			User astro5 = new User("Clara","clara@gmail.com", null, "female");
			astrocal.findSign(astro5);
                        User astro6 = new User("Clara","clara@gmail.com", "03-11-1997", null);
			astrocal.findSign(astro6);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
