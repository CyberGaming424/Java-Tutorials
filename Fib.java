
/**
 * Write a description of class Fib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fib
{
   public static void main(String[] args)
   {
       int[] numbers;
       numbers = new int[20];
       numbers[0]=0;
       numbers[1]=1;
       System.out.println("\nFibonacci series:\n");
       System.out.println(numbers[0]);
       for(int i=2; i<20; i++)
       {
           numbers[i]=numbers[i-2]+numbers[i-1];
           System.out.println(numbers[i]);
        }
    }
}
