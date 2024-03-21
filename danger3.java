// public class danger3{


//     private int data = 20;
//     void display(){

//         class local{
            
//             void msg(){
    
//                 System.out.println("this is a message!");
//             }
//             local obj = new local();
//             obj.msg();
//         }
//     }

//     public static void main(String[] args){
    
//         display();
//     }
// }
public class danger3 {

    private int data = 20;

    void display() {
        class Local {
            void msg() {
                System.out.println("This is a message!");
            }
        }
        Local obj = new Local(); // Instantiate the local class inside the method
        obj.msg();
    }

    public static void main(String[] args) {
        danger3 obj = new danger3(); // Create an instance of danger3
        obj.display(); // Call the display method using the instance
    }
}
