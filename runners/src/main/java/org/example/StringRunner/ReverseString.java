package org.example.StringRunner;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String[]args){
        String str = "Sabiee";
        StringBuilder res = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            res.append(str.charAt(i));
        }
        System.out.println("Reverse String- "+res.toString());

        char[] ch = str.toCharArray();
        String resCh = IntStream.range(0,ch.length).mapToObj(n->ch[ch.length-1-n])
                .map(String::valueOf).collect(Collectors.joining());
        System.out.println("Reverse ChString- "+ resCh);
    }
}
