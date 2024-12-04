package com.upskill.java_6;

public class Exepection_tryCatchFinale {
	/* Java Exceptions - Use "try - catch - finally"
	A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations
	1. ArithmeticException - error has occurred in an arithmetic operation.
	2. ArrayIndexOutOfBoundsException - an array has been accessed with an illegal index.
	3. ClassNotFoundException - try to access a class whose definition is not found
	4. FileNotFoundException - a file is not accessible or does not open.
	6. InterruptedException
	5: Enterrupted xeptutr Putread 15 wa cant, trepire, of coing some processine, and it is interrupted.
	7. NoSuchFieldException - class does not contain the field or variable specified
	8. NoSuchMethodException - accessing a method which is not found
	9. NullPointerException - referring to the members of a null object
	10. NumberFormatException - a method could not convert a string into a numeric format
	11. RuntimeException - any exception which occurs during runtime.
	12. StringIndexOutOfBoundsException - String class methods to indicate that an index is either negative or
	B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java
	*/
	
	// Expections - NumberFomalExection
	
	     public static void main(String[] args) throws myExecption{
		int index = 4;
	
		// Built-in Exceptions - Built-in exception throws by java which explain certain error situations
		
		try{
		int[] ageFury = new int []{25,28,32,29};
		System.out.println("Student Age = " + ageFury[index]);
		}catch (Exception e){
			e.printStackTrace();
			
			//Specfic Buit-in Expections - NumberFomalExection
			
				try{
				int[] new = Integer.parsenIn [](test);
				System.out.println("Persed value ="+ num);
				}catch (NumberFomalExection e){
					e.printStackTrace();
				}
				
				
				//User-Define Execptions
					try{
						throw new myExecption (Test);
					
						}catch (NumberFormatException e){
							e.printStackTrace();
		}
					
		finally{
		System.out.println(">>>>>>>>>>   100Test Complete :100 ");
		
		
	
	}
   }
 }
