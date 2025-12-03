package org.example.StringRunner;

import javax.swing.text.PlainDocument;

public class Palindrome {
    public static void main(String[]args){
        String str = "RaceCar";
        boolean palindrome = true;
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.toLowerCase().charAt(i)!=str.toLowerCase().charAt(j)){
               palindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println("Plaindrome- "+palindrome);
    }
}
