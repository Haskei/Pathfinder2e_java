package pathfinder.character;

public abstract class Classes {
    String name;
    String description;
    String baseAttackBonusType;
    int level;

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

    public String getBaseAttackBonusType() {
        return baseAttackBonusType;
    }

    public void setBaseAttackBonusType(String baseAttackBonusType) {
        this.baseAttackBonusType = baseAttackBonusType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
