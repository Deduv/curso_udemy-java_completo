package model.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogGeneretor {

	public static void main(String[] args) {
		String user [] = new String [] {"amanda", "alex86", "bobbrown", "amanda", "jeniffer", "alex86", "amanda"};
		String accessTime [] = new String [] {"2018-08-26T20:45:08Z", "2018-08-26T21:49:37Z", "2018-08-27T03:19:13Z", 
				"2018-08-28T08:11:00Z", "2018-08-27T09:19:24Z", "2018-08-27T22:39:52Z", "2018-08-28T07:42:19Z"};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/big_ed/in.txt"))) {
			for (int i = 0; i < user.length; i++) {
				bw.write(user[i] + " " + accessTime[i]);
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
