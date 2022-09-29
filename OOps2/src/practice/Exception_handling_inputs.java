package practice;
import java.util.Scanner;

public class Exception_handling_inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc1=new Scanner(System.in);
				Scanner sc2=new Scanner(System.in)){
			System.out.println("Enter 1st number :");
			int a=sc1.nextInt();
			System.out.println("Enter 2nd number :");
			int b=sc2.nextInt();
			int multiply=a*b;
			System.out.println("Result : "+multiply);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("Executed");
		}
	}

}
