import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestingDateTime {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    LocalDate lastWeek = localDate.minus(7, ChronoUnit.DAYS);
    LocalDate nextWeek = localDate.plus(7, ChronoUnit.DAYS);

    // Duration:
    Duration t1 = Duration.between(lastWeek.atStartOfDay(), nextWeek.atStartOfDay());

    System.out.println("Dias: " + t1.toDays());

  }
}