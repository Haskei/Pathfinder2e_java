package pathfinder.character;
import pathfinder.spell.Spell;

import java.util.*;
public class Spellcaster extends Classes{
    boolean isArcane;
    boolean isDivine;
    List<String> restricted = new ArrayList<String>();
    List<Spell> spellBookL1 = new ArrayList<Spell>();
    List<Spell> spellBookL2 = new ArrayList<Spell>();
    List<Spell> spellBookL3 = new ArrayList<Spell>();
    List<Spell> spellBookL4 = new ArrayList<Spell>();
    List<Spell> spellBookL5 = new ArrayList<Spell>();
    List<Spell> spellBookL6 = new ArrayList<Spell>();
    List<Spell> spellBookL7 = new ArrayList<Spell>();
    List<Spell> spellBookL8 = new ArrayList<Spell>();
    List<Spell> spellBookL9 = new ArrayList<Spell>();

    public boolean isArcane() {
        return isArcane;
    }

    public void setArcane(boolean arcane) {
        isArcane = arcane;
    }

    public boolean isDivine() {
        return isDivine;
    }

    public void setDivine(boolean divine) {
        isDivine = divine;
    }

    public List<String> getRestricted() {
        return restricted;
    }

    public void setRestricted(List<String> restricted) {
        this.restricted = restricted;
    }

    public List<Spell> getSpellBookL1() {
        return spellBookL1;
    }

    public void setSpellBookL1(List<Spell> spellBookL1) {
        this.spellBookL1 = spellBookL1;
    }

    public List<Spell> getSpellBookL2() {
        return spellBookL2;
    }

    public void setSpellBookL2(List<Spell> spellBookL2) {
        this.spellBookL2 = spellBookL2;
    }

    public List<Spell> getSpellBookL3() {
        return spellBookL3;
    }

    public void setSpellBookL3(List<Spell> spellBookL3) {
        this.spellBookL3 = spellBookL3;
    }

    public List<Spell> getSpellBookL4() {
        return spellBookL4;
    }

    public void setSpellBookL4(List<Spell> spellBookL4) {
        this.spellBookL4 = spellBookL4;
    }

    public List<Spell> getSpellBookL5() {
        return spellBookL5;
    }

    public void setSpellBookL5(List<Spell> spellBookL5) {
        this.spellBookL5 = spellBookL5;
    }

    public List<Spell> getSpellBookL6() {
        return spellBookL6;
    }

    public void setSpellBookL6(List<Spell> spellBookL6) {
        this.spellBookL6 = spellBookL6;
    }

    public List<Spell> getSpellBookL7() {
        return spellBookL7;
    }

    public void setSpellBookL7(List<Spell> spellBookL7) {
        this.spellBookL7 = spellBookL7;
    }

    public List<Spell> getSpellBookL8() {
        return spellBookL8;
    }

    public void setSpellBookL8(List<Spell> spellBookL8) {
        this.spellBookL8 = spellBookL8;
    }

    public List<Spell> getSpellBookL9() {
        return spellBookL9;
    }

    public void setSpellBookL9(List<Spell> spellBookL9) {
        this.spellBookL9 = spellBookL9;
    }
}
