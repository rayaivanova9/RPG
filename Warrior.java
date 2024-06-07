public class Warrior extends Character {

    private int strength;
    private int armor;

    public Warrior(String name, double health, int mana, int level, double attackStrength, int strength, int armor) {
        super(name, health, mana, level, attackStrength);
        this.strength = strength;
        this.armor = armor;
    }
    public Warrior(String name) {
        super(name, 550, 100, 1, 50);
        this.strength = 0;
        this.armor = 10;
    }

    public int getStrength() { return strength; }
    public int getArmor() { return armor; }

    public void setStrength(int strength) { this.strength = strength; }
    public void setArmor(int armor) { this.armor = armor; }

    public void heavyAttack(Character person) {
        System.out.println(getName() + " attacked " + person.getName() + " using heavy attack!");
        double heavyAttackStrength = getAttackStrength() + this.strength;
        person.setHealth(person.getHealth() - heavyAttackStrength);
    }
    public void drinkStrengthPotion() {
        this.strength += 10;
    }
}
