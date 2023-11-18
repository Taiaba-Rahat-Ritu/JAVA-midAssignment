import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Year;

public class LeaveCalculator {

    public static void calculateLeaves(Employee employee) {
        int year = Year.now().getValue();
        LocalDate endOfYear = LocalDate.of(year, 12, 31);
        long daysWorked = ChronoUnit.DAYS.between(employee.getJoiningDate(), endOfYear) + 1;
        int totalDays = Year.isLeap(year) ? 366 : 365;

        employee.setVacationDays(calculateLeave(daysWorked, totalDays, isOfficer(employee) ? 15 : 10));
        employee.setSickDays(calculateLeave(daysWorked, totalDays, isOfficer(employee) ? 10 : 7));
    }

    private static int calculateLeave(long daysWorked, int totalDays, int totalLeaveDays) {
        double leaveDays = (double) daysWorked / totalDays * totalLeaveDays;
        return (int) Math.round(leaveDays);
    }

    private static boolean isOfficer(Employee employee) {
        // Implement logic to determine if the employee is an Officer
        // This could be based on employee ID, name, or another attribute
        return true; // Placeholder
    }
}
