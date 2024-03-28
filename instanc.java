// very simple usage of insatceof operator

public class instanc{

    public static void main(String[] args){

        instanc main1 = new instanc();
        System.out.println(main1 instanceof instanc);

        Object obj1 = "hi";
        //or Object obj1 = new String("hi");
        //or Object obj2 = new Integer(10);
        System.out.println(obj1 instanceof String);
        
    }
}
