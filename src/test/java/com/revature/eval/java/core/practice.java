package com.revature.eval.java.core;

public class practice {

	public static void main(String[] args) {
		System.out.println(acronym("graphic comp-network"));

	}
	
	public static String acronym(String phrase) {
		String acro = "";
		char delimit = ' ';
		char delimit2 = '-';
		for (int i=0; i<phrase.length(); i++) {
			if (i==0) {
				acro = acro + phrase.charAt(i);
			}
			else {
				if (phrase.charAt(i-1)==delimit || phrase.charAt(i-1)==delimit2) {
					acro = acro + phrase.charAt(i);
				}
			}
		}
		acro = acro.toUpperCase();
		return acro;

	}
}
