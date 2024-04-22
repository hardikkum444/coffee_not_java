import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");


        System.out.println("Elements of the ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        arrayList.add(1, "Grapes");
        arrayList.remove("Orange");

       System.out.println("\nElements of the ArrayList after modification:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

