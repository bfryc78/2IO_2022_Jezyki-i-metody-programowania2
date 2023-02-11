import java.util.*;

public class Main {

    private static final Map<Character, Integer> map = new HashMap<>();
    static{
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    static int romToArab(String s)
    {
        int suma=0;
        int r=s.length();
        for(int i =0; i<r;i++)
        {
            if(map.get(s.charAt(i))< map.get(s.charAt(i+1)))
            {
                suma-=map.get(s.charAt(i));
            }
            else
            {
                suma+=map.get(s.charAt(i));
            }
           //System.out.println(suma);
        }
        suma+=map.get(s.charAt(r));
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(romToArab("XIX"));
    }
}