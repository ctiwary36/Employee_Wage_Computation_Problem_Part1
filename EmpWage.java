package com.Employee;

public class EmpWage {

    //Method for calculating wages
  //using while loop for condition check
        public static void calculateWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {


            int FULL_DAYHR=8;
            int PART_TIMEHR=4;
            int day=0;
            int empHr=0;
            int wage = 0;
            //[printing  company details
            System.out.println("Details of " + companyName + " employee");
            System.out.println("|.......................................|");
            System.err.println("Wage per hour:" + wagePerHr);
            System.out.println("Maximum working days:" + maxWorkingDays);
            System.out.println("Maximum working hours:" + maxWorkingHrs);

            while (day <= 19) {
                int n = (int) (Math.random() * 10) % 3;
                switch (n) {
                    case 1:
                        System.out.println("Present Full day");
                        wage = (wage + (maxWorkingHrs * FULL_DAYHR));

                        empHr=(empHr+ FULL_DAYHR);
                        day++;
                        break;
                    case 2:
                        System.out.println("Present PartTime");
                        wage = (wage + (maxWorkingHrs * PART_TIMEHR));

                        empHr=(empHr+ PART_TIMEHR);

                        day++;
                        break;
                    default:
                        System.out.println("Absent");
                        day++;
                        if( empHr == 100)
                            break;
                }
            }
            //Printing wages
            System.out.println("Total Wage of a month is: " +wage);

            System.out.println("Employee Hour: "+empHr);
            System.out.println("Employee Work Day: "+day + "\n");

        }

    }