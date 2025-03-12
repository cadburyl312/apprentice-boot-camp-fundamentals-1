package cards;

import cards.interfaces.Card;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AnimalCardTest {

    @Test
    public void snap_whenTheSameCard_snap(){
        Card card = new AnimalCard(Animal.HARE);
        Card other = new AnimalCard(Animal.HARE);

        assertThat(card.snap(other)).isTrue();
    }

    @Test
    public void snap_whenNotTheSameAnimalCard() {
        Card card = new AnimalCard(Animal.HARE);
        Card other = new AnimalCard(Animal.DEER);

        assertThat(card.snap(other)).isFalse();
    }
}