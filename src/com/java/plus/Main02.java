package com.java.plus;

import java.util.Scanner;

public class Main02 {
    private String getEvenOdd(int num) {
        if (num % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }

    }
    public void printEvenOddStatement(int first, int second) {
        System.out.printf("%s+%s=%s", getEvenOdd(first), getEvenOdd(second), getEvenOdd(first + second));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        Main02 main = new Main02();
        main.printEvenOddStatement(first, second);

    }
}
