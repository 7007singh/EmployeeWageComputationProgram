import java.util.Random;

public class EmpWageComputation
{
    public static void main (String args [])
    {
        System.out.println("Welcome to Employee Wage Computation Program");

        final int FULL_TIME = 1;
        Random random = new Random();
        int empAttendance = random.nextInt(2);
        if (empAttendance == FULL_TIME) 
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}
