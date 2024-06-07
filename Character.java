public class Character {

    private String name;
    private double health;
    private int mana;
    private int level;
    private double attackStrength;

    public Character(String name, double health, int mana, int level, double attackStrength) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.level = level;
        this.attackStrength = attackStrength;
    }

    public String getName() { return name; }
    public double getHealth() { return health; }
    public int getMana() { return mana; }
    public int getLevel() { return level; }
    public double getAttackStrength() { return attackStrength; }

    public void setName(String name) { this.name = name; }
    public void setHealth(double health) { this.health = health; }
    public void setMana(int mana) { this.mana = mana; }
    public void setLevel(int level) { this.level = level; }
    public void setAttackStrength(double attackStrength) { this.attackStrength = attackStrength; }

    public void attack(Character person) {
        System.out.println(this.name + " attacked " + person.getName() + "!");
        if (person instanceof Warrior) {
            person.setHealth(person.getHealth() + ((Warrior) person).getArmor() - attackStrength);
        }
        else
            person.setHealth(person.getHealth() - attackStrength);
    }
    public void levelUp() {
        setLevel(getLevel() + 1);
    }
    public void heal(int mana) {
        setHealth(getHealth() + mana);
    }
}
