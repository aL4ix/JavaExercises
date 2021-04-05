package ch02.ex01;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ch02Ex01 {
    public static void main(String[] args) {
        System.out.println(Ch02Ex01.class.getSimpleName());
        LocalDate date;
        int month;
        if (args.length >= 2) {        
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = LocalDate.of(year, month, 1);
        } else {
            date = LocalDate.now().withDayOfMonth(1);
            month = date.getMonthValue();
        }
        
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        DayOfWeek weekday = date.getDayOfWeek();
        
        int weekDayValue = (weekday.getValue() + 1) % 7; // 1 = Monday, ... 7 = Sunday
        for (int i = 1; i < weekDayValue; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if ((date.getDayOfWeek().getValue() + 1) % 7 == 1) 
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) 
           System.out.println();
    }
}