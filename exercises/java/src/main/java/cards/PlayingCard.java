package cards;

public class PlayingCard {
    final private int suit;
    final private int faceValue;

    public PlayingCard(int suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public int getSuit() {
        return suit;
    }


    public int getFaceValue() {
        return faceValue;
    }

}
