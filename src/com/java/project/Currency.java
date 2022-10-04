package com.java.project;

public class Currency {
    public static void main(String[] args) {
        //한화로 구하는 것
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr100 = 100;

        //raw한 코드로 접근
        int refund = 25000;

        System.out.printf("5만원권 %d장\n", refund / curr50000); //25000원을 5만원으로 거슬러주면? 0장
        System.out.printf("1만원권 %d장\n", refund / curr10000); //25000원을 5만원으로 거슬러주면? 0장
        System.out.printf("5천원권 %d장\n", refund / curr5000); //25000원을 5만원으로 거슬러주면? 0장
        System.out.printf("1천원권 %d장\n", refund / curr1000); //25000원을 5만원으로 거슬러주면? 0장
        System.out.printf("백원권 %d장\n", refund / curr100); //25000원을 5만원으로 거슬러주면? 0장

    }
}
