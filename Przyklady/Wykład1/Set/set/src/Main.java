import java.util.*;

public class Main {
    public static void main(String[] args) {



        Set<Integer> s1 = new TreeSet<Integer>(Arrays.asList(4, 5, 3, 2, 8, 5));
        Set<Integer> s2 = new TreeSet<Integer>();
        s2.addAll(Arrays.asList(3, 8, 1, 7));
        System.out.println(s1);
        System.out.println(s2);

        Set<Integer> suma =new HashSet<Integer>(s1);
        suma.addAll(s2);
        System.out.println("Suma zbiorów:");
        System.out.println(suma);

        Set<Integer> wspolna =new HashSet<Integer>(s1);
        wspolna.retainAll(s2);
        System.out.println("Część wspólna zbiorów:");
        System.out.println(wspolna);

        Set<Integer> roznica =new HashSet<Integer>(s1);
        roznica.removeAll(s2);
        System.out.println("Róznica zbiorów:");
        System.out.println(roznica);
    }
}