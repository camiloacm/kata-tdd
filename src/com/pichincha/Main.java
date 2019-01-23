package com.pichincha;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        Calculator calc = new Calculator();
        int answer = calc.Evaluate("");

        System.out.println("The answer is " + answer);
    }
}
