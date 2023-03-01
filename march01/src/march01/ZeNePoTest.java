package march01;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZeNePoTest {

	@Test
	public void test() {
		ZeNePo obj=new ZeNePo();
		String s=obj.ZNP(3);
		assertEquals("p",s);
	}

}
