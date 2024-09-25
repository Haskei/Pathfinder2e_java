package pathfinder.character;
import pathfinder.item.Armor;
import pathfinder.item.Weapon;

import java.util.*;
public class Character {
    String name;
    String ancestry;
    int currentHp;
    int maxHp;
    int tempHp;
    int speed;
    int age;
    int xp;
    int encBulk;
    int maxBulk;
    int totalLevel;
    ArrayList<Classes> classes = new ArrayList<Classes>();
    ArrayList<Armor> equippedArmor = new ArrayList<Armor>();
    Weapon rightHand;
    Weapon LeftHand;
    int strScore;
    int dexScore;
    int intScore;
    int wisScore;
    int chaScore;
    int armorClass;
    ArrayList<Skill> skills = new ArrayList<Skill>();
    ArrayList<String> trained = new ArrayList<String>();
    ArrayList<String> expert = new ArrayList<String>();
    ArrayList<String> master = new ArrayList<String>();
    ArrayList<String> legendary = new ArrayList<String>();
    ArrayList<String> languages = new ArrayList<String>();
    int strBonus = 0;
    int dexBonus = 0;
    int intBonus = 0;
    int wisBonus = 0;
    int chaBonus = 0;
    int strTotal;
    int dexTotal;
    int intTotal;
    int wisTotal;
    int chaTotal;
    int strModifier;
    int dexModifier;
    int intModifier;
    int wisModifier;
    int chaModifier;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAncestry() {
        return ancestry;
    }

    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getTempHp() {
        return tempHp;
    }

    public void setTempHp(int tempHp) {
        this.tempHp = tempHp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getStrScore() {
        return strScore;
    }

    public void setStrScore(int strScore) {
        this.strScore = strScore;
    }

    public int getDexScore() {
        return dexScore;
    }

    public void setDexScore(int dexScore) {
        this.dexScore = dexScore;
    }

    public int getIntScore() {
        return intScore;
    }

    public void setIntScore(int intScore) {
        this.intScore = intScore;
    }

    public int getWisScore() {
        return wisScore;
    }

    public void setWisScore(int wisScore) {
        this.wisScore = wisScore;
    }

    public int getChaScore() {
        return chaScore;
    }

    public void setChaScore(int chaScore) {
        this.chaScore = chaScore;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }
}
