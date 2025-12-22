// Count Frequency of each word
// List<String> words = Arrays.asList(
//     "apple", "banana", "apple", "orange", "banana", "apple"
// );
import java.util.stream.Collectors;
import java.util.*;
class Main{
    public static void main(String[]args){
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        
        System.out.println(words.stream()
        .collect(Collectors.groupingBy(i -> i, Collectors.counting())));
    }
}
