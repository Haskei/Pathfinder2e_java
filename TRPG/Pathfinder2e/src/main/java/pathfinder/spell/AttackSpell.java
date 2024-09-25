package pathfinder.spell;

public class AttackSpell {
    int numberOfDice;
    int sizeOfDice;
    String damageType;
    String saveType;
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
    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getSaveType() {
        return saveType;
    }

    public void setSaveType(String saveType) {
        this.saveType = saveType;
    }
}
