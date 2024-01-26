package IsArraySorted;

import java.util.Scanner;

public class IsArraySorted {
    static boolean isSorted(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of th array:");
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        System.out.println("Enter the array elements:");
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
        System.out.println(isSorted(a));
    }
}