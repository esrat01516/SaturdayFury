package com.upskill.java_1;

public class Variables1 {
//	Variables in Java
	//Instance OR global variable - Variables declared in Class level, outside method
	//Static variable - variables belong to class and don't required creating object
	//Local variable - variables declared in methods 
	//Method parameter - variables used as method parameter
	
	
//	Variables in Java

	
    public String country = "UK";		//Instance OR global variable - Variables declared in Class level, outside method

    public static String region = "England"; //Static variable - variables belong to class and don't required creating object
	
	public void ny(String county){			//Method parameter - variables used as method parameter
		
		String city = "London";			//Local variable - variables declared in methods
		
		System.out.println("--- London Method ---");
		System.out.println(country);
		System.out.println(city);
		System.out.println(county);
	}
	
	public void Manchester(String county){			//Method parameter - variables used as method parameter
		
		String city = "Manchester";		//Local variable - variables declared in methods
		
		System.out.println("--- London Method ---");
		System.out.println(country);
		System.out.println(city);
		System.out.println(county);
	}
	
	public static void main(String[] args) {
		

		Variables myobj = new Variables();			//ClassName objName = new ClassName();
		myobj.ny("Liverpool");
		myobj.nj("Ilford");
		
		System.out.println("--- Static / NonStatic ---");
		System.out.println(myobj.country);
		System.out.println(region);
	}
}