public class Main {
    public static void main(String[] args) throws MojWyjatek
    {
     /*  try {
           int tab[] = new int[3];
           tab[0] = 5;
           tab[1] = 6;
           tab[2] = 7;
           for (int i = 0; i <= tab.length; i++)
               System.out.println(tab[i]);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
            System.out.println("Bład wyjścia poza tablice"+ e.toString());
       }
       catch(Exception e)
       {
           System.out.println("Błąd"+ e.toString());
       }
        System.out.println("Koniec programu");

        */
try {
    Operacja o1 = new Operacja(45, 3);
    System.out.println(o1.operacja('+'));
    System.out.println(o1.operacja('/'));

    Operacja o2 = new Operacja(45, 0);
    System.out.println(o2.operacja('+'));
    System.out.println(o2.operacja('/'));
}
catch( MojWyjatek e) {
    System.out.println(e.getMessage());
}
    }
}