import java.util.Comparator;

public class SortDeckIntoSuits implements Comparator<Card>{

    @Override
    public int compare(Card card, Card o) {
        if (card.getSuit().equals(o.getSuit())) {
            return card.getSuit().compareTo(o.getSuit());
        } else {
            return o.getValue() - card.getValue();
        }
    }
}
