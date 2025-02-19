import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate firstDate = LocalDate.parse(date1);
        LocalDate secondDate = LocalDate.parse(date2);

        // Calculate the difference in days and return the absolute value
        return (int) Math.abs(ChronoUnit.DAYS.between(firstDate, secondDate));
    }
}
