import java.util.*;

public class arryb {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] ab= new int[10];//init

        for (int i = 0; i < ab.length; i++) {
            System.out.println(ab[i]);            
        }
        System.out.println("Enter array elements");
        for (int i = 0; i < ab.length; i++) {
            int s= sc.nextInt();
            ab[i]=s;         
        }
        System.out.println("array elements are");
        for (int i = 0; i < ab.length; i++) {
            System.out.print(ab[i]+",");            
        }
    }
}
