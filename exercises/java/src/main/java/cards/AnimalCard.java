package cards;

import cards.interfaces.Card;

public class AnimalCard implements Card {

    private final Animal animal;

    public AnimalCard(Animal animal) {
        this.animal = animal;
    }

    public boolean snap( Card otherCard ){

        if (otherCard != null) {
            if (otherCard instanceof AnimalCard) {
                AnimalCard other = (AnimalCard) otherCard;
                return this.animal.equals(other.animal);
            }
            else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
