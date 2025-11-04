
import java.util.*;
public class WordFrequency {
    public static void main(String agrs[]){
    String fruits[] = {"Apple", "Orange", "Banana", "Apple", "Orange", "Banana"};
    HashMap<String, Integer> freq = new HashMap<>();
    for(String fruit: fruits){
        if(freq.containsKey(fruit)){
            freq.put(fruit, freq.get(fruit)+1);
        }else{
            freq.put(fruit, 1);
        }
    }
    System.out.println(freq);
}
}
