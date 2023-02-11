import java.util.*;

public class Main {
    public static void main(String[] args) {

    Map<String , String> panstwa = new HashMap<>();
        panstwa.put("Polska", "Warszawa");
        panstwa.put("Rosja", "Moskwa");
        panstwa.put("Włochy", "Rzym");

        for(Map.Entry<String, String> c:panstwa.entrySet() )
        {
            System.out.println("Kraj: " + c.getKey()+"miasto: "+c.getValue());
        }

        System.out.println("Hello world!");
    }
}