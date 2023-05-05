
package com.mycompany.extracred;
import java.util.Arrays;

public class Extracred {
    public static double LrgSmlratio(int[] arr) { 
        if (arr.length < 4) {
            return 0;}
        
        Arrays.sort(arr);
        double ratio = (arr[arr.length - 1] + arr[arr.length - 2]) / (arr[0] + arr[1]);
        return ratio;}
    
    public static void main(String[] args) {
        
        int[] arr = {3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
        double ratio = LrgSmlratio(arr);
        
        System.out.println("The ratio is " + ratio);}
}
