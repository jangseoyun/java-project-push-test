package com.java.project;

import java.util.Scanner;

public class CurrencyCnt {
    public static void main(String[] args) {
        //화폐 매수를 구하는 프로그램 구현
        //각 화폐 단위로 나누었을 때 몫과 나머지를 구하는 문제
        //나머지를 변수에 누적
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
