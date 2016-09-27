import java.util.Scanner;

public class TuitionCalculator {
	
	public static void main(String[] args) {
	
		System.out.println("Enter your intial tuition:");
		Scanner tuition = new Scanner(System.in);
		float Tuition = tuition.nextFloat();
		
		System.out.println("Enter the percentage increase:");
		Scanner percentage = new Scanner(System.in);
		float Percentage = percentage.nextFloat();
		Percentage = Percentage/100;
		
		float Debt = Tuition;
		
		for(int year=1; year<4; year++){
			float AddDebt = Tuition * (1+Percentage);
			Debt = Debt + AddDebt;
			Tuition = AddDebt;
		}
		System.out.println(String.format("The cost to complete your degree is: %.2f",Debt));
	}
}