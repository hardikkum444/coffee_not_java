// same question but taking input in a different manner
import java.util.*;

public class temp1{

    public static void main(String[] args){

        ArrayList<String> mandom = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            String temp = scan.next();
            if(!temp.matches("[a-zA-Z]+")){
                
                break;
            }
            mandom.add(temp);

        }

        String ans = mandom.get(0);
        for(String obj : mandom){
            if(obj.length()<ans.length()){
                ans = obj;
            }
        }

        System.out.println("Shortest word in the list is -> "+ans);
    }
}
