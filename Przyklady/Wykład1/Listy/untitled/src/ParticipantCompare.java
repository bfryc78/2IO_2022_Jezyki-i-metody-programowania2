import java.util.Comparator;

public class ParticipantCompare implements Comparator<Participant> {

  /*   @Override
    public int compare(Participant o1, Participant o2) {
        return o1.getName().compareTo(o2.getName());
    }
*/
    @Override
    public int compare(Participant o1, Participant o2) {
        if (o1.getAge()==o2.getAge())
            return 0;
        else
            if (o1.getAge()>o2.getAge())
                return 1;
            else
                return-1;

    }
}
