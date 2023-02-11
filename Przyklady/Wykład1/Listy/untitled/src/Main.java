import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Participant> list= new LinkedList<Participant>();
        list.add(new Participant("Franek", 19));
        list.add(new Participant("Anna", 15));
        list.add(new Participant("Zofia", 12));
        list.add(new Participant("Basia", 20));

        for(Iterator<Participant> participantIterator= list.iterator();participantIterator.hasNext();)
        {
            Participant p=participantIterator.next();
            if(p.getAge()>19)
                participantIterator.remove();
        }

       /*  for(Participant p: list)
         {
             if(p.getAge()>19)
                 System.out.println(p.toString());
         }*/
       Collections.sort(list,new ParticipantCompare());
       System.out.println(list);
    }

}