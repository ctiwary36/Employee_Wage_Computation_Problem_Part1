package com.Employee;

public class Emp {
    //Main Method
        public static void main(String[] args) {

            //Creating object for Empwage
            EmpWage obj =  new EmpWage();

        //calling calculateWage method using object
            obj.calculateWage("FlipKart", 50, 20, 200);
            obj.calculateWage("Amazon", 25, 25, 250);


        }
    }

