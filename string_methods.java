//demostarting the use of some string methods

public class string_methods {

    public static void main (String[] args){

        String name = "Hardik";

        String lename = name.toLowerCase();

        System.out.println(name.length());
        System.out.println(lename);              //notice this
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());

        String sen = "        My name is Jacob         ";

        //--> use of trim

        System.out.println(sen);
        System.out.println(sen.trim());       

        //--> use of .substring()

        System.out.println(name.substring(2)); //remember here the indexing will begin from 0 and will start from the alphabet at the number you have enetered
        
        System.out.println(name.substring(2,5)); //starts from index 2 , ends with index 5, excluding the letter at that index !

        //--> use of .replace()

        System.out.println(name.replace('k', 'c'));
        System.out.println(name.replace("k", "ck"));
        //important to note that it replace every instance of the old char and target
 
        //--> use of .startsWith and .endsWith (always returns a bool value)

        System.out.println(name.startsWith("Ha"));
        System.out.println(name.endsWith("ick"));

        //--> use of .charAt, this one is pretty usefull

        System.out.println(name.charAt(1));

        //--> use of .indexOf

        System.out.println(name.indexOf('d'));

 
    }
    
}
