package hashSet;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set= new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(4); //list.add(el)

        //Search-contains
        if (set.contains(1)) System.out.println("set contains one");
        if (!set.contains(6)) System.out.println("does not contains 6"); //checks in the set ,element contain false will true otherwise return false

        //Delete
        set.remove(1);
        if(!set.contains(1)) System.out.println("deleted one");

        //size
        System.out.println("size of set : "+set.size());
        //print all elements in the set
        System.out.println(set);
        //Iterator
        Iterator it = set.iterator();


    }
}
