// another usage of regex in java

import java.util.*;
import java.util.regex.*;

public class regeX4{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("[A-Z]");

        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){

            System.out.print(matcher.group());
        }
    }
}
