import static org.junit.Assert.*;

import org.junit.Test;

public class testCustomer {

	@Test
	public void test() {
		Customer customer = new Customer("Ramdev");
		assertEquals("Ramdev", customer.name);
	}

}