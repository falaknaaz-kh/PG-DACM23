import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in array :");
        int n = sc.nextInt();
        
        System.out.println("Enter elements in array:");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println("enter element to be searched");
        int j = sc.nextInt();
        int found = 0;
        
        for(int i : arr)
        {
            if(arr[i] == j)
            {
                System.out.println(j + " is found at index " + (i + 1));
                found = 1;
                break;
            }
                
        }
        
        if(found == 0)
            System.out.println("element not found!");
    }
}