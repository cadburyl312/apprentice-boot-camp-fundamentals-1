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
        PlayingCard[] deck = new PlayingCard[52];

        int count = 0;
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck[count] = new PlayingCard(suit, faceValue);
                count++;
            }
        }

        int cardNumber = 0;
        for (PlayingCard playingCard : deck) {
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

            String suitName;
            switch (playingCard.getSuit()){
                case 0: suitName = "clubs"; break;
                case 1: suitName = "diamonds"; break;
                case 2: suitName = "hearts"; break;
                case 3: suitName = "spades"; break;
                default: throw new IllegalArgumentException("Something went wrong " + playingCard.getSuit() + "is not a valid suitName!");
            }

            result[cardNumber] = faceValueName + " of " + suitName;
            cardNumber++;
        }

        return result;
    }
}
