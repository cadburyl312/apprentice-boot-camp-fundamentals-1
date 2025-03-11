package cards;

public class PlayingCard {
    final private String suit;
    final private String faceValue;

    public PlayingCard(String suit,String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getSuit() {
        return suit;
    }


    public String getFaceValue() {
        return faceValue;
    }

}
