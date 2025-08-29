package com.jenkins.git.demo;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.sub(5, 3));
    }
}
