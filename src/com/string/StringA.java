package com.string;

public class StringA {
	
public static void main(String[] args) {
	
	System.out.println("simson checking conflict");
		
		String s ="java";
		//length----checks the length of given string
		int length = s.length();	
		System.out.println(length);
		//charAt----checks and print the char of given index value
		char charAt = s.charAt(2);
		System.out.println(charAt);
		//isEmpty---checks the given string is empty 
		boolean b = s.isEmpty();
		System.out.println(b);
		//indexOf---print the index value of given char in first occurrence
 		int indexOf = s.indexOf('a');
		System.out.println(indexOf);
		//lastIndexOf---print the index value of given char in last occurrence
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);
		//startsWith----checks the given string is starts with input string
		boolean startsWith = s.startsWith("Ja");
		System.out.println(startsWith);
		//endsWith----checks the given string is ends with input string
		boolean endsWith = s.endsWith("ava");
		System.out.println(endsWith);
		//toUpperCase---changes the given string into uppercase
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		//toLowercase----changes the given string into lowercase
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		//replace----replaces the particular char in the given string
		String replace = s.replace('a', '#');
		System.out.println(replace);
		//replaceAll----replaces the whole string into the given string
		String replaceAll = s.replaceAll("ja", "de");
		System.out.println(replaceAll);
		//contains----checks the given string is present in the input string
		boolean contains = s.contains("s");
		System.out.println(contains);
		//trim---removes the unwanted space present in the starting of the given string
		String a = "      Greens Technology Solution Limited"; 
		System.out.println(a);
		String trim = a.trim();
		System.out.println(trim);
		//substring----here I can use the index valuae and remove the particular characters
		String n = "Greens Technology Solution Limited";
		String substring = n.substring(7);
		System.out.println(substring);
		//equals---checks the given string and input string are equal or not(case sensitive)
		String S1 ="JAVA";
		boolean equals = s.equals(S1);
		System.out.println(equals);
		//equalsIgnoreCase----checks the given string and input string are equal or not
		boolean equalsIgnoreCase = s.equalsIgnoreCase(S1);
		System.out.println(equalsIgnoreCase);
		//concat----to merge to strings
		String concat = s.concat(S1);
		System.out.println(concat);
		
		
		
		
		
		
		
		
		
		
		
		
		

		}
		
		


}
