public class Mage extends Character{

    private int intelligence;
    private int spellPower;

    public Mage(String name, double health, int mana, int level, double attackStrength, int intelligence, int spellPower) {
        super(name, health, mana, level, attackStrength);
        this.intelligence = intelligence;
        this.spellPower = spellPower;
    }
    public Mage(String name) {
        super(name, 300, 150, 1, 20);
        this.intelligence = 5;
        this.spellPower = 30;
    }

    public int getIntelligence() { return intelligence; }
    public int getSpellPower() { return spellPower; }

    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }
    public void setSpellPower(int spellPower) { this.spellPower = spellPower; }

    public void castSpell(Character person) {
        System.out.println(getName() + " attacked " + person.getName() + " using a spell!");
        person.setHealth(person.getHealth() - (getAttackStrength() + this.spellPower));
    }
}
