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

        int count = 0;
        for (Suit suit : Suit.values()) {
            for (FaceValue value : FaceValue.values()) {
                deck.addCard(count, new PlayingCard(suit.getName(), value.getName()));
                count++;
            }
        }

        int cardNumber = 0;
        for (PlayingCard playingCard : deck.getDeck()) {
            String suitName = playingCard.getSuit();

            result[cardNumber] = playingCard.getFaceValue() + " of " + suitName;
            cardNumber++;
        }

        return result;
    }
}
