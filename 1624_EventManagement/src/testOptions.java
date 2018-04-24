import static org.junit.Assert.*;

import org.junit.Test;

public class testOptions {

	@Test
	public void test() {
		Options op = new Options("Testing",1000);
		assertEquals(1000, op.price);
	}

}