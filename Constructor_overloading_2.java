//demonstrating the use of this keyword

public class Constructor_overloading_2{

	public static void main(String[] args){

		Box box1 = new Box(2,3,4,50);
		box1.pri();

		Box box2 = new Box(100);
		box2.pri();
	}
}

class Box{

	int length, width, height;
	int num;

	Box(){

		this.length = 1;
		this.width = 1;
		this.height = 1;
	}

	Box(int l, int w, int h, int n){

		this.length = l;
		this.width = w;
		this.height = h;
		this.num = n;

	}

	Box(int n2){

		//this is the important part
		//the 'this' keyword applies the props of the default constructor


		this();
		this.num = n2;
	}

	public void pri(){

		System.out.println("The volume your shape is : "+this.length*this.width*this.height);
		System.out.println("and your shape number is : "+this.num);
		System.out.println();
	}
}