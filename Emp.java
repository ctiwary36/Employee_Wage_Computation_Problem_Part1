import java.util.Scanner;
public class Emp{
	public static void main(String [] args) {
		int attendence = 1;
		int wagePerHour = 20;
		int fullDayWork = 8;
		int partTimeWorker = 8; 
		

		
		double value = Math.floor(Math.random() * 10) % 2;
		
		if(value == attendence) {
			System.out.println("Emp is Present");
			Scanner sc = new Scanner (System.in);
		System.out.println("please enter 1 for fullTime or Enter 2 for Part Time");
		int n = sc.nextInt();
		sc.close();
			switch(n){
		case 1: 
		
		System.out.println("Employee Daily Wage is: " +wagePerHour*fullDayWork);
		break;
		case 2:
		System.out.println("Part Employee Daily Wage is: " +wagePerHour*partTimeWorker);
			break;
			default:
			System.out.println("please select only between 1 and 2");
			}
			}
		else 
		System.out.println("EMp is Absent");
		
}
}