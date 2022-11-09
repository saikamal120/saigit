package javasessions;

import java.util.*;   

public class javatPermutations {  
    public static void getPermutations(String[] numbers){  
        helper(numbers, 0);  
    }  
  
    private static void helper(String[] numbers, int pos){  
        if(pos >= numbers.length - 1){   
            System.out.print("[");  
            for(int i = 0; i < numbers.length - 1; i++){  
                System.out.print(numbers[i] + ", ");  
            }  
            if(numbers.length > 0)   
                System.out.print(numbers[numbers.length - 1]);  
            System.out.println("]");  
            return;  
        }  
  
        for(int i = pos; i < numbers.length; i++){   
          
            String t = numbers[pos];  
            numbers[pos] = numbers[i];  
            numbers[i] = t;  
  
            helper(numbers, pos+1);  
  
            t = numbers[pos];  
            numbers[pos] = numbers[i];  
            numbers[i] = t;  
        }  
    }  
    public static void main(String args[]) {  
        String[] numbers = {"Ani", "Sam", "Joe"};  
        getPermutations(numbers);  
    }  
}  
