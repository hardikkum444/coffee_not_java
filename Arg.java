//revising args in the form of multiplying
//nothing to commit
public class Arg{

	public static void main (String[] args){

		if (args.length>0){

			int multiple = 1;
			for(int i=0;i<args.length;i++){

					Integer n1 =  Integer.parseInt(args[i]);
					multiple = multiple*n1;

			}

			System.out.println("And your product is--> "+multiple);
		}
		else{

			System.out.println("Nothing given as an arg");
		}
	}

}
