package com.upskill.java_6;

public class MultiThreadingRubable implements Runnable {
	
  @Override
  public void run (){
	  try{
	  System.out.println(Thread.currentThread().getId());
  } catch(Execption e){
	e.printStackTrace();
   }
  }
}