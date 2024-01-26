package ReverseArray;

import java.util.Scanner;

public class ReverseArray {
    static void Reverse(int[] a){
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
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
        Reverse(a);
    }
}