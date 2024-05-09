// taking input until string is given in java
// important concept
import java.util.*;

public class main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> mandom = new ArrayList<>();
        
        while(scan.hasNext()){
            if(scan.hasNextInt()){
                int input = scan.nextInt();
                mandom.add(input);
            }else{
                break;
            }
        }
        
        System.out.println(mandom);
    }
}
