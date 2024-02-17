//conversion of string to int ascii
public class toCharArray{
    
    public static void main(String[] arg){
        
        String ans = "APPLE";
        
        char[] charArr = ans.toCharArray();
        
        int[] arr = new int[charArr.length]; 
        
        for(int i =0;i<charArr.length;i++){
        
        //int ans1 = (int)(charArr[0]); 
        arr[i] = (int)(charArr[i]);
        
        }
        
        for(int i =0;i<charArr.length;i++){
        
        System.out.println(arr[i]);
        
        }
    }
}