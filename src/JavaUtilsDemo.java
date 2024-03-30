import java.util.*;

public class JavaUtilsDemo {
    public static void main(String[] args) {

    	
    	
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("----- LinkedList -----");
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("LinkedList contains 'Banana': " + linkedList.contains("Banana"));

        linkedList.remove("Banana");
        System.out.println("LinkedList after removing 'Banana': " + linkedList);


        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("\n----- ArrayList -----");
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("ArrayList contains 'Banana': " + arrayList.contains("Banana"));

        arrayList.remove("Banana");
        System.out.println("ArrayList after removing 'Banana': " + arrayList);


        HashMap<String, Integer> hashMap = new HashMap<>();
        System.out.println("\n----- HashMap -----");
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);
        
        
        

        System.out.println("Age of Alice: " + hashMap.get("Alice"));

        hashMap.remove("Bob");
        
        
        
        System.out.println("HashMap after removing Bob: " + hashMap);


        HashSet<String> hashSet = new HashSet<>();
        System.out.println("\n----- HashSet -----");
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        
        

        System.out.println("HashSet contains 'Banana': " + hashSet.contains("Banana"));

        hashSet.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + hashSet);
    }
}
