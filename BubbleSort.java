public class BubbleSort {
	public static void main(String[] args)
	{
		//This will initialise an array with the given numbers
		int[] numbers = {16, 100, 205, 8, 1, 3, 2, 5, 7, 6, 15, 10, 14};
		
		//This prints the unsorted array
		System.out.println("The original sequence:- 16, 100, 205, 8, 1, 3, 2, 5, 7, 6, 15, 10, 14\n");
		//Creates an int and a boolean that makes the bubble sort possible
		int temp;
		boolean fixed=false;
		//This sorts the array
		while(fixed==false)
		{
			fixed=true;
			for (int i=0; i<numbers.length-1; i++)
			{
				if(numbers[i] > numbers[i+1])
				{
					temp = numbers[i+1];
					numbers[i+1]=numbers[i];
					numbers[i]=temp;
					fixed=false;
				}
			}
		}
		System.out.println("The sorted sequence:- ");
		for(int i = 0; i<numbers.length; i++)
		{
			System.out.println(numbers[i] + ", ");
		}
	}
}
