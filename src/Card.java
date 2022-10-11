import java.util.Arrays;

public class Card implements Comparable<Card>  {

    private String suit;
    private String symbol;
    private int value;

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", symbol='" + symbol + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(Card other) {
        if(this.value < other.value){
            return -1;
        }
        if(this.value > other.value){
            return 1;
        }
        return this.value - other.value;
    }

}
