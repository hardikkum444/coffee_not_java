// using cases in java to determine zodiac sign

import java.util.*;

public class main {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int date = scan.nextInt();
        scan.nextLine();
        String month = scan.nextLine();
        String month2 = month.toLowerCase();
        
        switch(month2){
             
             case "january":
                 if(date>=20){
                     System.out.println("Aquarius");
                 }else if(date<=19){
                     System.out.println("Capricorn");
                 }
                 break;
            case "february":
                if(date>=19){
                    System.out.println("Pisces");
                }else if(date<=18){
                    System.out.println("Aquarius");
                }
                break;
            case "march":
                if(date>=21){
                    System.out.println("Aries");
                }else if(date<=20){
                    System.out.println("Pisces");
                }
                break;
            case "april":
                if(date>=20){
                    System.out.println("Taurus");
                }else if(date<=19){
                    System.out.println("Aries");
                }
                break;
            case "may":
                if(date>=21){
                    System.out.println("Gemini");
                }else if(date<=20){
                    System.out.println("Taurus");
                }
                break;
            case "june":
                if(date>=21){
                    System.out.println("Cancer");
                }else if(date<=20){
                    System.out.println("Gemini");
                }
                break;
            case "july":
                if(date>=23){
                    System.out.println("Leo");
                }else if(date<=22){
                    System.out.println("Cancer");
                }
                break;
            case "august":
                if(date>=23){
                    System.out.println("Virgo");
                }else if(date<=22){
                    System.out.println("Leo");
                }
                break;
            case "september":
                if(date>=23){
                    System.out.println("Libra");
                }else if(date<=22){
                    System.out.println("Virgo");
                }
                break;
            case "october":
                if(date>=23){
                    System.out.println("Scorpio");
                }else if(date<=22){
                    System.out.println("Libra");
                }
                break;
            case "november":
                if(date>=22){
                    System.out.println("Sagittarius");
                }else if(date<=21){
                    System.out.println("Scorpio");
                }
                break;
            case "december":
                if(date>=22){
                    System.out.println("Capricorn");
                }else if(date<=21){
                    System.out.println("Sagittarius");
                }
                break;
        
            
        }
    }
}
