package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map <String, String> cookies = new TreeMap<>();
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "8871723");
		
		cookies.remove("email");
		cookies.put("phone", "46242674");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Cookies size: " + cookies.size());
			
		for (String f : cookies.keySet()) {
			System.out.println(f + ": " + cookies.get(f));
		}
	}

}
