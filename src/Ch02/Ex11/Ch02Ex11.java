package Ch02.Ex11;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.lang.System.out;


public class Ch02Ex11 {
    public static void main(String[] args) {
        out.println(Ch02Ex11.class.getSimpleName());
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

        out.println(" Sun Mon Tue Wed Thu Fri Sat");
        DayOfWeek weekday = date.getDayOfWeek();

        int weekDayValue = (weekday.getValue() + 1) % 7; // 1 = Monday, ... 7 = Sunday
        for (int i = 1; i < weekDayValue; i++)
            out.print("    ");
        while (date.getMonthValue() == month) {
            out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if ((date.getDayOfWeek().getValue() + 1) % 7 == 1)
                out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            out.println();
    }
}