import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeApi {

	public static void main(String[] args) {
		try {
			// Both startDate values are virtually the same.
//			LocalDate startDate = LocalDate.of(2017, 1, 1);
			LocalDate startDate = LocalDate.parse("2017-01-01");
//		LocalDate endDate = LocalDate.of(2017, 2, 1);
			LocalDate endDate = LocalDate.parse("2017-02-01");
			Period period = Period.between(startDate, endDate);
			long totalDays = ChronoUnit.DAYS.between(startDate, endDate);

			System.out.println("DEBUG - WHAT IS PERIOD [" + period.getDays() + "] WHAT IS TOTDAYS [" + totalDays + "]");
		} catch (DateTimeException e) {
			System.out.println(e);
		}

	}
}
