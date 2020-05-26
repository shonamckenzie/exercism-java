import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime date;

    public Gigasecond(LocalDate moment) {
        this.date = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.date = moment;
    }

    public LocalDateTime getDateTime() {
        return this.date.plusSeconds((long) 1e9);
    }
}
