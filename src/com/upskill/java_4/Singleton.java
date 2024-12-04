
package com.upskill.java_4;
public class Singleton {
// Singleton is class that can have only one object
// Private constructor, it prevents any other class from instanti
	
    private Singleton(){    	
    }
   //Private static object of the class
    private static Singleton SingletonObj = new Singleton();
    
  
   protected void demo() {
       System.out.println("Demo method for singleton class");
   }

   protected void fury() {
       System.out.println("Demo method for singleton fury class");
   }

   protected void loki() {
       System.out.println("Demo method for singleton loki class");
   }

   public static void main(String[] args) {

}
}