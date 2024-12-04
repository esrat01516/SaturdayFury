package com.upskill.java_6;

public class MultiThreadingTread  extends Thread{
	public void run (){
		try{
		  System.out.println(Thread.currentThread().getId());
	  } catch(Execption e){
		e.printStackTrace();
	  }
}
}