package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double minute, coast;
        int CoastMinute = 2;
        String day;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число минут вашего разговора! ");
        minute = in.nextInt();
        System.out.println("Введите сегодняшний день(на английском)");
        day = in.next();
        switch (day)
        {
            case "Saturday":
            {
                System.out.println("Из-за выходного дня вам предоставляется скидка 20% на все ваши звонки в течение дня! ");
                coast = (minute * CoastMinute)* 0.80;
                System.out.println("Вам необходимо заплатить - "+coast);
                break;
            }
            case "Sunday":
            {
                System.out.println("Из-за выходного дня вам предоставляется скидка 20% на все ваши звонки в течение дня! ");
                coast = (minute * CoastMinute)* 0.80;
                System.out.println("Вам необходимо заплатить - "+coast);
                break;
            }
            default:
            {
                coast = minute * CoastMinute;
                System.out.println("Вам необходимо заплатить - "+coast);
                break;
            }
        }

    }
}
