import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CardGame implements Comparable<Card>{

    private String[] suit= {"♠️", "♥️", "♦️", "♣️"};
    private String[] symbol= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};
    ArrayList<Card> deckOfCards = new ArrayList<Card>();

    public CardGame() {
        this.deckOfCards = getDeck();
    }

    public ArrayList<Card> getDeck(){
        ArrayList<Card> newDeck = new ArrayList<>();
        for (String suit: suit) {
            for (int i = 0; i < symbol.length; i++) {
                Card card = new Card(suit, symbol[i], value[i]);
                newDeck.add(card);
//                System.out.println(card);
            }
        }
        return newDeck;
    }



    public Card dealCard(){
        Card card  = null;
        if(deckOfCards.size() > 0) {
            card = deckOfCards.get(0);
            deckOfCards.remove(0);
        }
        return card;
        //    Takes the card from the top of the deck and returns it.
    }

    public int cardsLeft(){
        return deckOfCards.size();
    }

    public ArrayList<Card> sortDeckInNumberOrder(){
        Collections.sort(deckOfCards);
        return deckOfCards;
        //    Sorts the deck in number order (e.g. 2222333344445555 etc) and stores the new shuffled deck back into the deckOfCards attribute.
    }

    public ArrayList<Card> sortDeckIntoSuits(){
        Collections.sort(deckOfCards, new SortDeckIntoSuits());
        return deckOfCards;
//            Sorts the deck into suits (2,3,4,5,6,7,8,9,10,J,Q,K,A of hearts, then 2,3,4,5,6,7,8,9,10,J,Q,K,A of clubs etc.) and stores the new shuffled
//            deck back into the deckOfCards attribute.
            }

    ArrayList<Card> shuffleDeck(){
        Collections.shuffle(deckOfCards);
        return deckOfCards;
        //    Shuffles the deck into a random order and stores the new shuffled deck back into the deckOfCards attribute
    }


    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
