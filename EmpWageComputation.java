import java.util.Random;

public class EmpWageComputation
{
    public static void main (String args [])
    {
        System.out.println("Welcome to Employee Wage Computation Program");

        final int FULL_TIME = 1;
        final int PART_TIME = 2;
        final int EMP_RATE_PER_HR = 20;
        int empHrs = 0, empWage = 0;
        Random random = new Random();
        int empAttendance = random.nextInt(3);
        switch(empAttendance)
        {
            case FULL_TIME:
               System.out.println("Employee is Present Full Time");
               empHrs = 8;
               break;
            case PART_TIME:
               System.out.println("Employee is Present Part Time");
               empHrs = 4;
               break;
            default:
               System.out.println("Employee is Absent");
               empHrs = 0;
               break;
        }
        empWage = empHrs * EMP_RATE_PER_HR;
        System.out.println("Employee Wage:" + empWage);
    }
}
