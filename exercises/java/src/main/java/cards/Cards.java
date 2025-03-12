package cards;


public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        String[] result = new String[52];
        Deck deck = new Deck();

        int cardNumber = 0;
        for (PlayingCard playingCard : deck.getDeck()) {
            result[cardNumber] = playingCard.toString();
            cardNumber++;
        }
        return result;
    }
}
