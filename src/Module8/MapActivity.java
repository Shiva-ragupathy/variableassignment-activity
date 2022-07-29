package Module8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class MapActivity {
    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        //2 - Call print method to print the map passed as its parameter.
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

    }

    void print(Map map)
    {
        //3 - Type code to print this map
        Set keySet = map.keySet();
        System.out.println("*********************");
        System.out.println("Key\tValue");
        Iterator it = keySet.iterator();

        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + "\t" + map.get(key));
        }
     System.out.println("*********************");
    }
}






