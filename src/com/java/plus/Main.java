package com.java.plus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //정수 두개가 입력으로 들어온다.
        //만약 첫번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "+"를 출력한다.
        //그리고 두번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "="을 출력하고 결과로 나오는 값이 홀수인지 짝수인지 출력한다.

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int tmp = 0;

        if (num1 % 2 == 0) {
            System.out.print("짝수");
        } else {
            System.out.print("홀수");
        }
        System.out.print("+");
        tmp = num1;

        if (num2 % 2 == 0) {
            System.out.print("짝수");
        }else {
            System.out.print("홀수");
        }
        System.out.print("=");
        tmp += num2;

        if (tmp % 2 == 0) {
            System.out.print("짝수");
        }else {
            System.out.println("홀수");
        }

    }
}