//*******************************************************************
// Is Unique - Ch11, Ex13, p759
//  
// Write a method "isUnique" that accepts a map whose keys/values are Strings
//   as a parameter and returns true if no two keys map to the same value,
//   and false if any two or more keys do map to the same value.
// An empty map is considered to be unique, so the method should return true
//   if passed an empty map.
// 
// By: Michael Gilson
// Date: 5/3/2020
//*******************************************************************

// Import java.util.* to use Map, Collections.
import java.util.*;

public class UniqueMap {

	public static void main(String[] args) {
// Create Test HashMaps to run through isUnique method. One with unique
//     keys/values, one with shared value mapping, and one empty HashMap.
		Map<String, String> test1 = new HashMap<>();
			test1.put("Marty", "Stepp");
			test1.put("Stuart", "Reges");
			test1.put("Jessica", "Miller");
			test1.put("Amanda", "Camp");
			test1.put("Hal", "Perkins");
		Map<String, String> test2 = new HashMap<>();
			test2.put("Kendrick", "Perkins");
			test2.put("Stuart", "Reges");
			test2.put("Bruce", "Reges");
			test2.put("Jessica", "Miller");
			test2.put("Hal", "Perkins");
		Map<String, String> test3 = new HashMap<>();
  
  // Run the three test Maps through the isUnique method
		System.out.println(isUnique(test1)); // should return true
		System.out.println(isUnique(test2)); // should return false
		System.out.println(isUnique(test3)); // should return true
 
	} // end main
	 
	
// Method that takes a Map with String key/values as parameter and returns a boolean value
	public static boolean isUnique (Map<String, String> map) {
		
// Use .values() to create a Collection of the values in given map.
		Collection<String> values = map.values();
		
// Create a String/Integer map to hold the map values and their counts 
		Map<String, Integer> valTrack = new HashMap<>();
		
// For each loop to go through the Collection of Values and count them as they are added
//     to the valTrack HashMap. Each value will become a key with a value/count of 1, and
//     if valTrack already contains the key, its existing value/count will increase by 1.
		for (String word : values) {
			if (valTrack.containsKey(word)) {
				int count = valTrack.get(word);
				valTrack.put(word, count + 1);
			} else {
				valTrack.put(word,  1);
				
			}  // end else
		} // end for each loop

// Create a Collection of the values(counts) from the ValTrack HashMap
		Collection<Integer> counts = valTrack.values();

// Create a Boolean variable, defaulting to true.
		Boolean validate = true;

// For Each loop to go through the List of counts. If any count is more than 1,
//     the validate boolean will change to false, indicating there were repeated values.
		for (int amnt : counts ) {
			if (amnt > 1) {
				validate = false;
				
			} // end if statement
		} // end for each loop
		
// Method of type boolean requires a boolean return. 
		return validate;
		
	} // end method

		
} // end class
