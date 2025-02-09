public class Human {
    private String name; // Имя
    private int health; // НР
    private int attackPower; // Атака
    private int levelHuman; // Уровень
    private boolean intoBattle; //true или false

    public Human() {
        name = "Человек";
        health = 100;
        attackPower = 15;
        levelHuman = 1;
        intoBattle = false;
    }

    // геттеры и сеттеры
    public void setIntoBattle(boolean intoBattle) {
        this.intoBattle = intoBattle;
    }

    public boolean isIntoBattle() {
        return intoBattle;
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

    public int getLevelHuman() {
        return levelHuman;
    }

    public void setLevelHuman(int levelHuman) {
        this.levelHuman = levelHuman;
    }
}