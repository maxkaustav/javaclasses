import java.util.*;

public class Sum {
    /*
    *Student - question 20 - max marks-5
    *total marks obtained
    */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] a= new int[20];//array initialize
        
        
        for (int i = 0; i < a.length; i++) {
            int s=sc.nextInt();
            // if(s>5 || s<0)
            // {
            //     System.out.println("Entered marks should not be greater than 5 and greater than 0");
            //     continue;
            // }
            a[i]=s;

        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
        /*
        System.out.println();
        sc.close();
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        double avg = sum/(a.length+1);
        System.out.printf("Total value is %d and Average is %f", sum,avg);*/
    }
    
}
