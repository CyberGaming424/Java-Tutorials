import java.util.Scanner;
import javax.swing.*;
public class DynamicFib
{
   public static void main(String[] args)
   {
	   String prompt = JOptionPane.showInputDialog("How many numbers of the Fibonacci" 
			   + "series do you want to see?"); //asks and takes in the amount you want
       int number = Integer.parseInt(prompt);//Creates and int number and = to the amount the user gave to the prompt
	   int[] array; //Creates array
       array = new int[number];
       array[0]=0;
       array[1]=1;
       System.out.println("\nFibonacci series:\n");
       System.out.println(array[0]);
       for(int i=2; i<number; i++)
       {
           array[i]=array[i-2]+array[i-1];
           System.out.println(array[i]);
        }
    }
}

