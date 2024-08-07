package TestNg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("nonexistent.txt"));
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}


