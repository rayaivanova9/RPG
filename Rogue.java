public class Rogue extends Character {

    private int agility;
    private int dexterity;

    public Rogue(String name, double health, int mana, int level, double attackStrength, int agility, int dexterity) {
        super(name, health, mana, level, attackStrength);
        this.agility = agility;
        this.dexterity = dexterity;
    }
    public Rogue(String name) {
        super(name, 350,250, 1, 20);
        this.agility = 10;
        this.dexterity = 10;
    }

    public int getAgility() { return agility; }
    public int getDexterity() { return dexterity; }

    public void setAgility(int agility) { this.agility = agility; }
    public void setDexterity(int dexterity) { this.dexterity = dexterity; }

    public void sneakAttack(Character person) {
        System.out.println(getName() + " attacked " + person.getName() + " using a sneak attack!");
        person.setHealth(person.getHealth() - (getAttackStrength() + this.agility));
    }
    public void quickAttack(Character person) {
        person.setHealth(person.getHealth() - this.agility);
    }
}
