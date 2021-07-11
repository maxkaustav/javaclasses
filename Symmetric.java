import java.util.*;

public class Symmetric {
    /*
    *array-[1,2,3,1,2]-symmetric
    *array-[2,6,7,3,1]-non symmetric
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array");
        int l = sc.nextInt();// length of array as input
        int[] a = new int[l];// array with user input length

        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();//array elements
        }

        int mid_element = (int)Math.ceil((a.length+1)/2);//mid point of array

        int suml=0;//left side sum
        for (int i = 0; i < mid_element-1; i++) {
            suml=suml+a[i];// calculate left side sum
        }

        int sumr=0;// right side sum
        for (int i = mid_element; i < a.length; i++) {
            sumr=sumr+a[i];// calculate right side sum
        }
        
        if(suml== sumr)// check are they equal or not
            System.out.println("The array is symmetric");// if true symmetric
        else
            System.out.println("The array is not symmetric");

    }
}
