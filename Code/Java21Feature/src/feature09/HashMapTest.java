package feature09;

import java.util.HashMap;
import java.util.Random;

public class HashMapTest {

	public int hashCode() {
		return new Random().nextInt(1000);
	}
	
	public static void main(String[] args) {
		
		HashMapTest obj = new HashMapTest();
		System.out.println("Hashcode: " + obj.hashCode());
		
		HashMap<String, Integer> map = new HashMap<>(1000);
		
		map.put("Makarand", 40);
		map.put("Rahul", 39);
		map.put("Rajesh", 38);
		map.put("Mahi", 5);
		map.put("Matri", 7);
		map.put("Girish", 35);
		map.put("Manish", 15);
		map.put("Raju", 45);
		map.put("John", 55);
		map.put("Sachin", 25);
		map.put("Sachin1", 25);
		map.put("Sachin2", 25);
		map.put("Sachin3", 25);
		map.put("Sachin4", 25);
		
		System.out.println("Map: " + map);
		
		
	}

}
