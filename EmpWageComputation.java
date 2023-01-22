import java.util.Random;

public class EmpWageComputation {
    public static void main (String args [])
    {
        System.out.println("Welcome to Employee Wage Computation Program");

        final int FULL_TIME = 1;
        final int PART_TIME = 2;
        final int MAX_WORKING_DAYS = 20;
        final int EMP_RATE_PER_HR = 20;
        int empHrs = 0, empWage = 0, day = 1, totalWage = 0;
        Random random = new Random();
        for(day = 1; day <= MAX_WORKING_DAYS; day++){
            int empAttendance = random.nextInt(3);
            switch(empAttendance)
           {
               case FULL_TIME:
                   System.out.println("\nEmployee is Present Full Time");
                   empHrs = 8;
                   break;
               case PART_TIME:
                   System.out.println("\nEmployee is Present Part Time");
                   empHrs = 4;
                   break;
               default:
                   System.out.println("\nEmployee is Absent");
                   empHrs = 0;
                   break;
            }
            empWage = empHrs * EMP_RATE_PER_HR;
            System.out.println("Day" + day + " Employee Wage:" + empWage);
            totalWage += empWage;
        }
        System.out.println("\nTotal Employee Wage " + totalWage + " for days " + (day-1));
    }
}
