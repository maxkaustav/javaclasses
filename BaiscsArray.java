import java.util.*;



public class BaiscsArray {
    
    public static void main(String[] args) {
        
        int a=10;//declare+init
        //int a = sc.nextInt();//Input
        int b;
        b=10;//Init




        //Make an array
        int[] a = {1,2,3,4,5,6,7,8,9};

        System.out.println("5th "+a[5-1]);
        //traverse through an array
        for(int i=0;i<=8;i++)
        {
            System.out.println(a[i]);
        }
        //size
        for(int i=0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        //foreach
        for(int x: a)//for x in a
        {
            System.out.println(x);
        }


    }
}
