import java.time.LocalDate;

public class DateUtils {
    public static boolean isDate(LocalDate startingDate, LocalDate endingDate) {
        LocalDate now = LocalDate.now();
        return isDate(startingDate, endingDate, now);
    }

    private static boolean isDate(LocalDate startingDate, LocalDate endingDate, LocalDate now) {
        return now.isAfter(startingDate)
                &&
                now.isBefore(endingDate);
    }
}