import java.util.*;

class myThread extends Thread{

	// @Override
	// Override can also only be applied on run method specific to the thread class
	public void run(){

		while(true){
			System.out.println("thread one is running");
		}
	}
}

class myThread2 extends Thread{

	// @Override
	public void run(){

		while(true){
			System.out.println("2 is running son!");
		}
	}
}


public class multithreading1{

	public static void main(String[] args){

		myThread one = new myThread();
		myThread2 two  = new myThread2();

		one.start(); //calling a thread
		two.start(); //calling a thread
		// two.print();
		// one.print();
		
	}
}

//important point the function in the thread classes should be declared as 'run'
//for this to actually work!
