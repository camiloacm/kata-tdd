package com.pichincha;


public class Calculator {

    public Calculator() {

    }

    public int Evaluate(String input) {
        int number = 0;
        if(input == null || input.isEmpty()) {
            return number;
        }

        try {
            number = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Error convirtiendo número a entero");
            number = -1;
        }

        return number;
    }
}
