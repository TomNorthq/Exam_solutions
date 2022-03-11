package collections;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WachtrijTest {
	
	public void testWachtrij(Wachtrij wachtrij) {
		wachtrij.put(1);
		wachtrij.put(2);
		assertEquals(1, wachtrij.take());
	}

	public void testCollection(Collection collection) {
		collection.put(1);
		collection.put(2);
		assertTrue(collection.take() == 1 || collection.take() == 2);
	}
	
	@Test
	void test() {
		testWachtrij(new Wachtrij());
		testCollection(new Stapel());
		testCollection(new Wachtrij());
	}

}
