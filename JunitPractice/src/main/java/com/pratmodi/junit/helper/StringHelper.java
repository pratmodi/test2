package com.pratmodi.junit.helper;

public class StringHelper {

	public String truncateAInFirstTwoPositions(String str) {
		
		if(str.length() <= 2) 
		{
			return str.replaceAll("A", "");
		}
		
		String first2chars = str.substring(0, 2);
		String afterfirst2chars = str.substring(2);
		
		return first2chars.replaceAll("A", "") + afterfirst2chars;
	}
	
	public boolean areFirstTwoCharactersSame(String str) {
		if(str.length()<=1) 
		{
			return false;
		}
			return str.charAt(0) == str.charAt(1);
	}
	
	public boolean areFirstTwoAndLastTwoCharactersSame(String str) {
		if(str.length()<=1) 
		{
			return false;
		}
		if(str.length()==2) 
		{
			return true;
		}
		
		String firstTwocharacters = str.substring(0,2);
		String lastTwoCharacters = str.substring(str.length()-2);
				
		return firstTwocharacters.equals(lastTwoCharacters);		
	}
	
}
