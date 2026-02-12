package Hashing;
import java.util.HashMap;
import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("Harsha",15);
        map.put("rohit",45);
        System.out.println(map);
        if (map.containsKey("Harsha")) System.out.println("45 is present");

        System.out.println(map.get("rohit"));//key exists

        //Iteration (1)
        for( Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //Removing
        map.remove("China");
        System.out.println(map);


    }
}
