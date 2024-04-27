// cool question from codetantra
import java.util.*;

public class temp1{

    public static void main(String[] args){

        ArrayList<String> mandom = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            String temp = scan.nextLine();
            if(!temp.matches("[a-zA-Z]+")){
                
                break;
            }
            mandom.add(scan.nextLine());

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
