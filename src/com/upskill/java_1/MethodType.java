package com.upskill.java_1;

public class MethodType {

    /**
      Types of Methods:
      1. Void Method
      2. Static Method
      3. Return Type Method
     */

    // Class variable for hourly income
   
    public static int hourlyIncome = 65;
    public static void main(String[] args) {
    MethodType obj = new MethodType();
    obj .annualIncomeVoid();
    System.out.println("My Monthly Income = " + obj. monthlyIncomeReturn());
    weeklyIncomeStatic ();
    }
    //void Method
    public void annualIncomeVoid(){
    int calculateAnnualIncome = hourlyIncome * 2000;
    System.out.println("My Annual Income = " + calculateAnnualIncome) ;
    }
    //Return Type Method
    public int monthlyIncomeReturn (){
    int calculateMonthlyIncome = hourlyIncome * 180;
    return calculateMonthlyIncome;
    }
    //Static Method
    public static void weeklyIncomeStatic(){
    int calculateWeeklyIncome = hourlyIncome * 40;
    System.out.println("My Wekly Income = " + calculateWeeklyIncome);
    }
   
    }

