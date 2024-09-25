package pathfinder.item;

public class Weapon extends Item {
    boolean twoHanded;
    boolean ranged;
    int numberOfDice;
    int sizeOfDice;

    public boolean isRanged() {
        return ranged;
    }

    public void setRanged(boolean ranged) {
        this.ranged = ranged;
    }

    public boolean isTwoHanded() {
        return twoHanded;
    }

    public void setTwoHanded(boolean twoHanded) {
        this.twoHanded = twoHanded;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int getSizeOfDice() {
        return sizeOfDice;
    }

    public void setSizeOfDice(int sizeOfDice) {
        this.sizeOfDice = sizeOfDice;
    }
}
