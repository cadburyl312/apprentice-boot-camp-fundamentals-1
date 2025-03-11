package cards;

public class Deck {
    private PlayingCard[] deck = new PlayingCard[52];

    void addCard(int index, PlayingCard card) {
        deck[index] = card;
    }

    public PlayingCard[] getDeck() {
        return deck;
    }

    public void setDeck(PlayingCard[] deck) {
        this.deck = deck;
    }
}
