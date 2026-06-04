package Esercizio1;

import java.util.*;

public class EmailUniche {
	public static void main(String[] args) {
		List<String> emails = new ArrayList<>();
		Set<String> emailsSet = new HashSet<>();
		
		emails.add("gigi@email.com");
		emails.add("gigi@email.com");
		emails.add("mario@email.com");
		emails.add("luigi@email.com");
		
		for (String email: emails) {
			emailsSet.add(email);
		}
		
		int numList = emails.size();
		int numSet = emailsSet.size();
		System.out.println(numList-numSet);
		
	}
	
	
	
}
