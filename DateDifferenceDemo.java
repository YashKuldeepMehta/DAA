import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Period;

public class DateDifferenceDemo {

    public static long getDaysDifference(LocalDate date1, LocalDate date2) {
        Period period = Period.between(date1, date2);
        return period.getDays() + (period.getMonths() * 30) + (period.getYears() * 365);
    }

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2024, 3, 1);
        LocalDate date2 = LocalDate.of(2024, 3, 10);

        System.out.println("LocalDate 1: " + date1);
        System.out.println("LocalDate 2: " + date2);
        System.out.println("Difference in days (LocalDate): " + getDaysDifference(date1, date2));

        LocalDateTime dateTime1 = LocalDateTime.of(2024, 3, 1, 10, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(2024, 3, 2, 12, 45);

        Duration duration = Duration.between(dateTime1, dateTime2);

        System.out.println("\nLocalDateTime 1: " + dateTime1);
        System.out.println("LocalDateTime 2: " + dateTime2);
        System.out.println("Difference in hours (LocalDateTime): " + duration.toHours());
        System.out.println("Difference in days (LocalDateTime): " + duration.toDays());
    }
}