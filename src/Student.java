import java.time.LocalDate;

public record Student(String firstName, String lastName, LocalDate dateOfBirth, int courseId, String dorm ) {
}
