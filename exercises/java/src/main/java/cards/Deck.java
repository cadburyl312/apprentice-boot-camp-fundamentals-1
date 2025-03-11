package cards;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Deck {
    private PlayingCard[] deck = new PlayingCard[52];

    Deck() {
        int count = 0;
        for (Suit suit : Suit.values()) {
            for (FaceValue value : FaceValue.values()) {
                this.addCard(count, new PlayingCard(suit, value));
                count++;
            }
        }
    }

    void addCard(int index, PlayingCard card) {
        deck[index] = card;
    }

    public PlayingCard[] getDeck() {
        return deck;
    }

    public void sortDeck() {
        Arrays.sort(deck);
    }

    public void sortDeck(Comparator<PlayingCard> ordering) {
        Arrays.sort(deck, ordering);
    }

    public void sortDeckReversed() {
        sortDeck(Comparator.comparing(PlayingCard::getSuit)
                .thenComparing(PlayingCard::getFaceValue)
                .reversed());
    }

    @Override
    public String toString() {
        return Arrays.stream(deck).map(PlayingCard::toString).collect(Collectors.toList()).toString();
    }
}
