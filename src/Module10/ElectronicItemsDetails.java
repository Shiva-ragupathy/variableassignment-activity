package Module10;
import java.util.HashMap;
import java.util.Map;

public class ElectronicItemsDetails {
    public static void main(String[] args) {

        //Create itemHashMap with String name and double price//
        Map<String, Double> itemHashMap = new HashMap<>();
        itemHashMap.put("Washing Machine", 1200.67);
        itemHashMap.put("Tv", 3423.87);
        itemHashMap.put("Refrigerator", 1599.99);
        itemHashMap.put("Laptop", 1500.00);
        ElectronicItemsDetails obj = new ElectronicItemsDetails();
        System.out.println("total sum of the TV is" + obj.returnPriceOfitem(itemHashMap, "TV"));
    }

    public Double returnPriceOfitem(Map<String, Double> map, String name) {
       return map.get(name);
    }
}