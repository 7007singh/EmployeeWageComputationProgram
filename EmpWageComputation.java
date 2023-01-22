import java.util.Random;

public class EmpWageComputation
{
    public static void main (String args [])
    {
        System.out.println("Welcome to Employee Wage Computation Program");

        final int FULL_TIME = 1;
        final int EMP_RATE_PER_HR = 20;
        int empHrs = 0, empWage = 0;
        Random random = new Random();
        int empAttendance = random.nextInt(2);
        if (empAttendance == FULL_TIME) 
        {
            System.out.println("Employee is Present");
            empHrs = 8;
        }
        else
        {
            System.out.println("Employee is Absent");
        }
        empWage = empHrs * EMP_RATE_PER_HR;
        System.out.println("Employee Wage:" + empWage);
    }
}
