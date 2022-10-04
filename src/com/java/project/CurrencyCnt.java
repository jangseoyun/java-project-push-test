package com.java.project;

import java.util.Scanner;

public class CurrencyCnt {
    public static void main(String[] args) {
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        Scanner sc = new Scanner(System.in);
        System.out.print(" 금액을 넣으세요 : ");
        int inputPrice = sc.nextInt();

        System.out.println("============[결과 출력]===========");

        for(int i = 0; i < money.length; i++) {
            int moneyCount = (inputPrice / money[i]);
            System.out.println(money[i] + "원 : " + moneyCount);
            inputPrice = (inputPrice - (moneyCount * money[i]));
        }

        sc.close();
    }
}
