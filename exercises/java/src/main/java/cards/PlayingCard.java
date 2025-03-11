package cards;

public class PlayingCard {
    final private String suit;
    final private int faceValue;

    public PlayingCard(String suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getSuit() {
        return suit;
    }


    public int getFaceValue() {
        return faceValue;
    }

}
