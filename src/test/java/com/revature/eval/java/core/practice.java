package com.revature.eval.java.core;


public class practice {
	/* The format is usually represented as
	* 
	* 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	* from 0 through 9.
	* 
	* Your task is to clean up differently formatted telephone numbers by removing
	* punctuation and the country code (1) if present.
	* 
	* For example, the inputs
	* 
	* +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	* the output
	* 
	* 6139950253
	* 
	* Note: As this exercise only deals with telephone numbers used in
	* NANP-countries, only 1 is considered a valid country code.
	*/

	public static void main(String[] args) {
		System.out.println(cleanPhoneNumber("+1 123-532-823487"));
		String t1 = "hello";
		t1 = t1.substring(1);
		System.out.println(t1);
	}

	public static String cleanPhoneNumber(String string) {
		String num = "";
		for (int i=0; i<string.length(); i++){
			if (Character.isDigit(string.charAt(i))){
				num = num + string.charAt(i);
			}
		}
		if (num.length()!=10){
			if (num.length()==11 && num.charAt(0)=='1'){
				num = num.substring(1);
			}
			else{
				throw new IllegalArgumentException();
			}
		}
		return num;
	}
}
