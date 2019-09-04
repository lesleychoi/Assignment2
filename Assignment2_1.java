import java.util.Scanner;

public class Assignment2_1
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		Double n;
		Double guess;
		Double r;
		System.out.println("Enter a positive number: ");
		n=input.nextDouble();
		guess=n/2;

		for (int i=0; i<5; i++)
		{
			r=n/guess;
			guess=(guess+r)/2;
		}

		System.out.printf("The square root of %.2f is= %.2f\n", n, guess);

	}
}