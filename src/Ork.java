public class Ork {
    private String name;
    private int health;
    private int attackPower;
    private int levelOrk;
    private boolean intoBattle;

    public Ork() {
        name = "Орк";
        health = 100;
        attackPower = 15;
        levelOrk = 1;
        intoBattle = false;
    }

    // геттеры и сеттеры
    public boolean isIntoBattle() {
        return intoBattle;
    }

    public void setIntoBattle(boolean intoBattle) {
        this.intoBattle = intoBattle;
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

    public int getLevelOrk() {
        return levelOrk;
    }

    public void setLevelOrk(int levelOrk) {
        this.levelOrk = levelOrk;
    }
}
