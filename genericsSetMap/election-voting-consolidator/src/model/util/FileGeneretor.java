package model.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileGeneretor {

	public static void main(String[] args) {
		
		String [] candidateName = {"Alex Blue", "Maria Green", 
				"Bob Brown", "Alex Blue", "Bob Brown", "Maria Green", "Maria Green", "Bob Brown", "Alex Blue"};
			int [] voteQuantity = {15, 22, 21, 30, 15, 27, 22, 25, 31};
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/big_ed/election.csv"))) {
				for(int i = 0; i < candidateName.length; i++) {
					bw.write(candidateName[i] + "," + voteQuantity[i]);
					bw.newLine();
				}
			}
			catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

	}

}
