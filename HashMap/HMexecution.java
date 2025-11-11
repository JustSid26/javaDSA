package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HMexecution {
    public static void main(String[] args) {

        // You cannot instantiate Map directly — use HashMap instead
        Map<String, Integer> hm = new HashMap<>();

        hm.put("Hello", 1);
        hm.put("Hi", 2);
        hm.put("Bye", 3);

        System.out.println(hm);

        // Corrected entry iteration
        for (Entry<String, Integer> ele : hm.entrySet()) {
            System.out.println("Key: " + ele.getKey() + " -> Value: " + ele.getValue());
        }

        // Corrected missing parenthesis
        for (String key : hm.keySet()) {
            System.out.println("Key: " + key + " -> Value: " + hm.get(key));
        }

        // Corrected syntax — ':' → ','
        hm.put("Exit", 10);
    }
}
