package com.Employee;

public class EmpWage {

//Method for calculating wages
//using while loop for condition check

        public static void calculateWage() {

    //declaring variables
            int FullDayHr=8;
            int PartTimeHr=4;
            int WagePerHr=20;
            int day=0;
            int empHr=0;
            int wage = 0;
            //
            while (day <= 19) {
                int n = (int) (Math.random() * 10) % 3;
                switch (n) {
                    case 1:
                        System.out.println("Present Fullday");
                        wage = (wage + (WagePerHr * FullDayHr));
                        empHr=(empHr+ FullDayHr);
                        day++;
                        break;
                    case 2:
                        System.out.println("Present PartTime");
                        wage = (wage + (WagePerHr * PartTimeHr));
                        empHr=(empHr+ PartTimeHr);

                        day++;
                        break;
                    default:
                        System.out.println("absent");
                        day++;
                        if( empHr == 100)
                            break;
                }
            }
            //Printing wages
            System.out.println("total wage of a month is: " +wage);

            System.out.println("Employee Hour: "+empHr);
            System.out.println("Employee Work Day: "+day);

        }
}
