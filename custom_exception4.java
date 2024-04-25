// using numberFormatException 

// public class prac3 {

//     public static void main(String[] args){

//         try{

//             double boy = 3.0;
//             int result = (int) boy;    
//             System.out.println("Done");
        
//         }catch(NumberFormatException e){
//             e.printStackTrace();
//         }
//     }
// }


public class prac3 {

    public static void main(String[] args){
        
        try{

            String non_numeric = "abc";
            int ans = Integer.parseInt(non_numeric);
        }catch(NumberFormatException e){

            e.printStackTrace();
        }

    }
}
