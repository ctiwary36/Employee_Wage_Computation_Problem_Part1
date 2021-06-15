public class Emp{
	public static void main(String [] args) {
		int isFullTime = 1;
		int wagePerHour = 20;
		int fullDayWork = 8;
		double value = Math.floor(Math.random() * 10) % 2;
		if(value == isFullTime) {
		System.out.println("Emp is Present");
		System.out.println("Employee Daily Wage is: " +wagePerHour*fullDayWork);
		}
		else 
		System.out.println("EMp is Absent");
		
}
}