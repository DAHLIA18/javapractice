import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstrualCycleCalculator {
    private int averageCycleLength;
    private String startingDate;
    private String nextPeriodDate;
    private String ovulationDate;

    
    public void setAverageCycleLength(int averageCycleLength) {
        this.averageCycleLength = averageCycleLength;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

   
    public String getNextPeriodDate() {
        return nextPeriodDate;
    }

    public String getOvulationDate() {
        return ovulationDate;
    }

    
    public void calculateNextPeriodAndOvulation() {
        
        LocalDate startDate = LocalDate.parse(startingDate, DateTimeFormatter.ISO_LOCAL_DATE);

        
        LocalDate nextPeriodStart = startDate.plusDays(averageCycleLength);
        nextPeriodDate = nextPeriodStart.format(DateTimeFormatter.ISO_LOCAL_DATE);

       
        LocalDate ovulationStart = startDate.plusDays(averageCycleLength / 2);
        ovulationDate = ovulationStart.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    
    public static void main(String[] args) {
       
        MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();
        calculator.setAverageCycleLength(28);
        calculator.setStartingDate("2022-01-01");
        calculator.calculateNextPeriodAndOvulation();

       
        System.out.println("Next Period Date: " + calculator.getNextPeriodDate());
        System.out.println("Ovulation Date: " + calculator.getOvulationDate());
    }
}