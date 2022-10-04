package com.java.project;

public class CurrencyRefact {
    public static void main(String[] args) {
        //한화로 구하는 것
        //raw한 코드로 접근

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        int refund = 25000;

        //문제를 풀면서 말로 적어보기
        //ex) 5000원권은 1장만 나오게 하고싶다. 왜냐하면 25000원에서 2만원은 만원짜리 두개로 처리했기 때문이다.
        System.out.printf("50000원권 몫:%d개 나머지:%d\n", refund / curr50000, refund % curr50000); // 나머지 moduleo mod %
        refund = refund % 50000;
        System.out.printf("10000원권 몫:%d개 나머지:%d\n", refund / curr10000, refund % curr10000);
        refund = refund % 10000;
        System.out.printf("5000원권 몫:%d개 나머지:%d\n", refund / curr5000, refund % curr5000);
        refund = refund % 5000;
        System.out.printf("1000원권 몫:%d개 나머지:%d\n", refund / curr1000, refund % curr1000);
        refund = refund % 1000;
        System.out.printf("500원권 몫:%d개 나머지:%d\n", refund / curr500, refund % curr500);
        refund = refund % 500;
        System.out.printf("500원권 몫:%d개 나머지:%d\n", refund / curr100, refund % curr100);
        refund = refund % 100;
        System.out.printf("50원권 몫:%d개 나머지:%d\n", refund / curr50, refund % curr50);
        refund = refund % 50;
        System.out.printf("500원권 몫:%d개 나머지:%d\n", refund / curr10, refund % curr10);
        refund = refund % 10;
        
    }
}
