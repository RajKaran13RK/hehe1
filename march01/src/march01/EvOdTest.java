package march01;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvOdTest {

	@Test
	public void test() {
		EvOd obj=new EvOd();
		String s=obj.EO(3);
		assertEquals("o",s);
	}

}
