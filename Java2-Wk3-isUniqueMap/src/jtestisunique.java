//imports needed for running Junit tests
import java.util.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class jtestisunique {

	@Test
	void test() {
	
	// Create HashMap with unique values
		Map<String, String> test1 = new HashMap<>();
			test1.put("One", "Ten");
			test1.put("Two", "Twenty");
			test1.put("Three", "Thirty");
			test1.put("Four", "Forty");
			test1.put("Five", "Fifty");
	// Create HashMap with repeated values
		Map<String, String> test2 = new HashMap<>();
			test2.put("One", "Ten");
			test2.put("Two", "Twenty");
			test2.put("Three", "Twenty");
			test2.put("Four", "Forty");
			test2.put("Five", "Ten");
	// Create HashMap with no key/values
		Map<String, String> test3 = new HashMap<>();	
		
	// Call the isUnique method for each test Map
		UniqueMap.isUnique(test1);
		UniqueMap.isUnique(test2);
		UniqueMap.isUnique(test3);
		
	// test to assert Equal on boolean results
		assertEquals(true, UniqueMap.isUnique(test1));
		assertEquals(false, UniqueMap.isUnique(test2));
		assertEquals(true, UniqueMap.isUnique(test3));
		
		
		
	
	}

}
