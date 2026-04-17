package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the file path: ");
		String path = sc.nextLine();
		
		Map <String, Integer> dataVotes = new LinkedHashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				String [] fields = line.split(",");
				
				String candidateName = fields[0];
				int quantityVotes = Integer.parseInt(fields[1]);
				
				if (dataVotes.containsKey(candidateName)) {
					int voteSoFar = dataVotes.get(candidateName);
					dataVotes.put(candidateName, quantityVotes + voteSoFar);
				}
				else {
					dataVotes.put(candidateName, quantityVotes);
				}
				
				line = br.readLine();
			}
			
			for (String key : dataVotes.keySet()) {
				System.out.println(key + ": " + dataVotes.get(key));
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();
	}

}
