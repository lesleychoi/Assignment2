import java.util.Scanner;

public class Assignment2_2
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String[] itemName = new String[3];
		int[] quantity = new int[3];
		double[] price = new double[3];
		double[] itemTotal = new double[3];
		double subTotal = 0, salesTax, total;

		for (int i=0; i<3; i++)
		{
			System.out.println("Input name of item " + (i+1) + ":");
			itemName[i]=input.nextLine();
			System.out.println("Input quantity of item " + (i+1) + ":");
			quantity[i] = input.nextInt();
			System.out.println("Input price of item " + (i + 1) + ":");
			price[i] = input.nextDouble();
			input.nextLine();
			itemTotal[i] = quantity[i] * price[i];
		}
		for (double x : itemTotal)
			subTotal+=x;
		salesTax=subTotal*0.0625;
		total=subTotal+salesTax;

		System.out.println("Your bill:");
		System.out.printf("%-30s %-10s %-10s %-10s%n", "Item", "Quantity", "Price", "Total");
		System.out.printf("%-30s %-10d %-10.2f %-10.2f%n", itemName[0], quantity[0], price[0], itemTotal[0]);
		System.out.printf("%-30s %-10d %-10.2f %-10.2f%n", itemName[1], quantity[1], price[1], itemTotal[1]);
		System.out.printf("%-30s %-10d %-10.2f %-10.2f%n%n", itemName[2], quantity[2], price[2], itemTotal[2]);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "Subtotal", "", "", subTotal);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "6.25% sales tax", "", "", salesTax);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "Total", "", "", total);		
	}
}