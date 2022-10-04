package com.java.plus;

import java.util.Scanner;

public class Main {
    public static String getResult(int inputNum) {
        if (inputNum % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }
    }
    public static void main(String[] args) {
        //정수 두개가 입력으로 들어온다.
        //만약 첫번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "+"를 출력한다.
        //그리고 두번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "="을 출력하고 결과로 나오는 값이 홀수인지 짝수인지 출력한다.
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int tmp = 0;

        System.out.print(getResult(first));
        System.out.print("+");
        tmp = first;

        System.out.print(getResult(second));
        System.out.print("=");
        tmp += second;

        System.out.println(getResult(tmp));

    }
}
