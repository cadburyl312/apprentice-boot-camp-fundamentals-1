package cards;

import java.util.Comparator;

public class PlayingCard implements Comparable {
    final private Suit suit;
    final private FaceValue faceValue;

    public PlayingCard(Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getSuit() {
        return suit.getName();
    }


    public String getFaceValue() {
        return faceValue.getName();
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }

    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(PlayingCard::getFaceValue)
                .compare(this, (PlayingCard) o);
    }
}
