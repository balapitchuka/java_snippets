package com.project.isbntools;

public class ValidateISBN {
	// ISBN Number can be 10 or 13 digits
	public boolean checkISBN(String isbn) {
		int total = 0;
		for(int i=0;i<isbn.length();i++) {
			total += isbn.charAt(i) * (10-i);
		}
		
		if (total % 11 == 0) {
			return true;
		}
		
		return false;
	}
    
}
