package com.java.project;

public class Currency {
    public static void main(String[] args) {
        //한화로 구하는 것
        //raw한 코드로 접근

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;

        int refund = 25000;

        System.out.printf("5만원권 몫:%d장 나머지:%d\n", refund / curr50000, refund % curr50000);
        System.out.printf("1만원권 몫:%d장 나머지:%d\n", refund / curr10000, refund % curr10000);
        System.out.printf("5천원권 몫:%d장 나머지:%d\n", refund / curr5000, refund % curr5000);
        System.out.printf("1천원권 몫:%d장 나머지:%d\n", refund / curr1000, refund % curr1000);
        System.out.printf("백원권 몫:%d장 나머지:%d\n", refund / curr500, refund % curr500);

    }
}
