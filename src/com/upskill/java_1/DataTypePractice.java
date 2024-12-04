  package com.upskill.java_1;

public class DataTypePractice {

	int     maxSpeed =  100;
	int     minSpeed =  10;
	double  weight   =  4703;
	
	boolean isTheCarOn = true;
	char condition      = 'A';
	
	public void printvariable(){
	System.out.println("This is the maxSpeed" + maxSpeed);
	System.out.println(minSpeed);
	System.out.println(weight);
	System.out.println(isTheCarOn);
	System.out .println(condition);
	
	}	


      public void wreckCar(){
    	condition ='C';
    }
       	public static void main (String[] args){
    //TODO code application logic here
           	Car Carry = new Car();
           	System.out.println("Family's Car:");
			familyCar.printVariables();
        	
        	Car aliceCar = familyCar;
         
        	familyCar.printVariables();
        	
        	Car AliceCar.printvariables();
        	System.out.println("Alice's Car:");
       	}

}