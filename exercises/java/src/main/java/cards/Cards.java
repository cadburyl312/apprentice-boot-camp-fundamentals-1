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
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck.addCard(count, new PlayingCard(suit.getName(), faceValue));
                count++;
            }
        }

        int cardNumber = 0;
        for (PlayingCard playingCard : deck.getDeck()) {
            String faceValueName;
            switch (playingCard.getFaceValue()){
                case 0: faceValueName = "ace"; break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: faceValueName = Integer.toString(playingCard.getFaceValue()+1); break;
                case 10: faceValueName = "jack"; break;
                case 11: faceValueName = "queen"; break;
                case 12: faceValueName = "king"; break;
                default: throw new IllegalArgumentException("Something went wrong " + playingCard.getFaceValue() + "is not a valid faceValue!");
            }

            String suitName = playingCard.getSuit();

            result[cardNumber] = faceValueName + " of " + suitName;
            cardNumber++;
        }

        return result;
    }
}
