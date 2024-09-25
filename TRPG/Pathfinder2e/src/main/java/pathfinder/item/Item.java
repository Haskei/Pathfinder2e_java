package pathfinder.item;
import java.util.*;
import pathfinder.character.Modifier;
public abstract class Item {
    String name;
    String description;
    int StrBonus;
    int DexBonus;
    int IntBonus;
    int WisBonus;
    int ChaBonus;
    LinkedList<Modifier> skillModifiers = new LinkedList<Modifier>();
    float weight;
    String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStrBonus() {
        return StrBonus;
    }

    public void setStrBonus(int strBonus) {
        StrBonus = strBonus;
    }

    public int getDexBonus() {
        return DexBonus;
    }

    public void setDexBonus(int dexBonus) {
        DexBonus = dexBonus;
    }

    public int getIntBonus() {
        return IntBonus;
    }

    public void setIntBonus(int intBonus) {
        IntBonus = intBonus;
    }

    public int getWisBonus() {
        return WisBonus;
    }

    public void setWisBonus(int wisBonus) {
        WisBonus = wisBonus;
    }

    public int getChaBonus() {
        return ChaBonus;
    }

    public void setChaBonus(int chaBonus) {
        ChaBonus = chaBonus;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
