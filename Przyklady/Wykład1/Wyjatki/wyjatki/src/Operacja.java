class MojWyjatek extends Exception
{
    public MojWyjatek()
    {

    }
    public MojWyjatek(String wiadomosc)
    {
        super(wiadomosc);
    }
}

public class Operacja {
    int m1, m2;

    public Operacja(int m1, int m2) {
        this.m1 = m1;
        this.m2 = m2;
    }
  float operacja(char oper) throws MojWyjatek

    {
      float wynik=0;
      if (oper=='/' & m2==0)
           throw new MojWyjatek("Dzielenie przez zero!!");
      switch (oper)
      {
          case '+': wynik = m1+m2; break;
          case '/': wynik = ((float)m1)/m2; break;
      }
      return wynik;
    }
}
