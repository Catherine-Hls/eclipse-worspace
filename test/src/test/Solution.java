package test;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n =  Math.abs(in.nextInt()); // the number of temperatures to analyse
        int[] table = new int[n];
        

        for (int i = 0; i < n; i++) {
        	table[i] = in.nextInt();
        }
        
        int min = table[0];
        
        for (int i = 1; i < n; i++) {
            if (table[i].isEmpty()) {
            	
            }
        	
        	if ((Math.abs(table[i]) < Math.abs(min) ||
                (Math.abs(table[i]) == Math.abs(min) && table[i] > min))) {
            		min = table[i];
            } 
        }
        System.out.println(min);      
    }
}
