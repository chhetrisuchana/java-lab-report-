import java.util.Scanner;
public class JavaProgram
{
    public static void main(String[] args)
    {
        int first, second, sum, subtract, multiply;
        float divide;
        Scanner calc= new Scanner(System.in);
        System.out.println("enter any two numbers");
        first=calc.nextInt();
        second=calc.nextInt();
        sum=first+second;
        subtract=first-second;
        multiply=first*second;
        divide=(float) first/second;
        System.out.println("sum="+sum);
        System.out.println("difference="+subtract);
        System.out.println("product="+multiply);
        System.out.println("quotient="+divide);
    }
}