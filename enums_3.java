import java.util.*;

enum toys{

	helicopter(20),
	car(10),
	apple(2);

	private int price;

	toys(int price){
		
		this.price = price;
	}

	public void getPrice(){
		System.out.println("and the price of your toy is: "+ this.price);
	}

}

public class enums_3 {
    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);

    	System.out.println("What would you like to buy");
    	System.out.println("Press 1 for helicpter");
    	System.out.println("Press 2 for car");
    	System.out.println("Press 3 for apple");

    	int n1 = scan.nextInt();

    	switch(n1){

    	case 1:
    		toys toy1 = toys.helicopter;
    		toy1.getPrice();
    		break;
      	case 2:
    		toys toy2 = toys.car;
    		toy2.getPrice();
    		break;
    	case 3:
    		toys toy3 = toys.apple;
    		toy3.getPrice();
    		break;
    	default:
    		System.out.println("Invalid option");
    		break;
    	}

    }
}


        