package BankingProject;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Enter S for Saving Account\n Enter C for Current Account ");
		Scanner scan= new Scanner(System.in);
		char A= scan.next().charAt(0);
		switch(A) {
		case 'S':
			Account_savings.main(args);
			break;
		case 'C':
			Account_current.main(args);
			break;
		default:
			System.out.println("Enter S or C");
			break;
			
		}
	

	}

}
