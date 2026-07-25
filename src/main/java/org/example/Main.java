package org.example;
import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String input) {
        String cleaned = input.toLowerCase(Locale.ENGLISH).replaceAll("[^a-z0-9]", "");
        Stack<Character> stack = new Stack<>();
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return cleaned.equals(reversed.toString());
    }

    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();
        int remaining = decimal;
        while (remaining > 0) {
            stack.push(remaining % 2);
            remaining = remaining / 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}