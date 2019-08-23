package com.thoughtworks.tdd;

/**
 * Created by twer on 3/28/14.
 */
public class HelloWorld {
	public String test(int i) {
		String result = "";
		if(i<1||i>120) {
			return "error";
		}
		if (i % 3 == 0) {
			result += "Fizz";
		}
		if (i % 5 == 0) {
			result += "Buzz";
		}
		if (i % 7 == 0) {
			result += "Whizz";
		}
		if("".equals(result)) {
			result=String.valueOf(i);
		}
		return result;
	}

}
