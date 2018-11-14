import java.util.Hashtable;
import java.util.Enumeration;

public class HashTable {
 
 public static void main(String[] args) {
 
   Enumeration names;
   int key;
 
   Hashtable<int, String> hashtable = new Hashtable<int, String>();
 
   hashtable.put(1,"Wahyu");
   hashtable.put(2,"Yudi");
   hashtable.put(3,"Mr. UD");
   hashtable.put(4,"Udi");
 
   names = hashtable.keys();
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " +
      hashtable.get(key));
   }
 }
}