//implementing the use of threads using runnable
//this is just another method

import java.util.*;

class threading1 implements Runnable{

	public void run(){

		while(true){

			System.out.println("this is man one!");
		}
	}
}

class threading2 implements Runnable{

	public void run(){

		while(true){

			System.out.println("!one man is this");
		}
	}
}


public class multithreading2{

	public static void main(String[] args){

		threading1 thread1 = new threading1();
		//we cant just execute thread1.start()
		//we have to create new object of thread class right here right now
		Thread gun1 = new Thread(thread1);
		threading2 thread2 = new threading2();
		Thread gun2 = new Thread(thread2);

		gun1.start();
		gun2.start();

		//i guess maybe the reason for using this method could be that 
		//i can then jyst inject whatever i want in or whatever object that has been created
		//and just create my runnable instances, dont have to do it again and again
		
	}
}
