package cards.interfaces;

public interface Deck {
    void shuffle();
    String[] getCards();
    Card deal();
}
