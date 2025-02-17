public class Elf {
    private String name;
    private int health;
    private int attackPower;
    private int levelElf;
    private boolean intoBattle;

    public Elf() {
        name = "Эльф";
        health = 100;
        attackPower = 15;
        levelElf = 1;
        intoBattle = false;
    }

    // геттеры и сеттеры
    public void setIntoBattle(boolean intoBattle) {
        this.intoBattle = intoBattle;
    }

    public boolean isIntoBattle() {
        return intoBattle;
    }

    public int getLevelElf() {
        return levelElf;
    }

    public void setLevelElf(int levelElf) {
        this.levelElf = levelElf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
