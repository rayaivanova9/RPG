import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System .in);

        Character per1 = new Character("Steve the Peasant", 200, 50, 1, 10);
        Warrior per2 = new Warrior("Dobrin the Strong");
        Warrior per3 = new Warrior("Colin the Brave", 600, 100, 2, 65, 10, 5);
        Mage per4 = new Mage("Susan the Weaver");
        Mage per5 = new Mage("Walter the White", 350, 125, 1, 25, 10, 25);
        Rogue per6 = new Rogue("Lola The Shadow");
        Rogue per7 = new Rogue("Amber the Stealthy", 375, 225, 2, 30, 15, 10);

        ArrayList<Character> list = new ArrayList<>();
        list.add(per1);
        list.add(per2);
        list.add(per3);
        list.add(per4);
        list.add(per5);
        list.add(per6);
        list.add(per7);

        System.out.println("Welcome to the Medieval RPG!");
        System.out.println("Choose a character for you and as an opponent:");

        System.out.println("1. Steve the Peasant - character\n2. Dobrin the Strong - warrior\n3. Colin the Brave - warrior");
        System.out.println("4. Susan the Weaver - mage\n5. Walter the White - mage\n6. Lola the Shadow - rogue\n7. amber the Stealthy - rogue");

        while (true) {
            try {
                System.out.print("Your character: ");
                int userChar = scan.nextInt();
                System.out.print("Opponent: ");
                int oppChar = scan.nextInt();

                System.out.println(list.get(userChar - 1).getName() + " health: " + list.get(userChar - 1).getHealth());
                System.out.println(list.get(oppChar - 1).getName() + " health: " + list.get(oppChar - 1).getHealth());
                list.get(userChar - 1).attack(list.get(oppChar - 1));
                System.out.println(list.get(userChar - 1).getName() + " health: " + list.get(userChar - 1).getHealth());
                System.out.println(list.get(oppChar - 1).getName() + " health: " + list.get(oppChar - 1).getHealth());
                if (list.get(userChar - 1) instanceof Warrior) {
                    ((Warrior) list.get(userChar - 1)).heavyAttack(list.get(oppChar - 1));
                }
                if (list.get(userChar - 1) instanceof Mage) {
                    ((Mage) list.get(userChar - 1)).castSpell(list.get(oppChar - 1));
                }
                if (list.get(userChar - 1) instanceof Rogue) {
                    ((Rogue) list.get(userChar - 1)).sneakAttack(list.get(oppChar - 1));
                }
                System.out.println(list.get(userChar - 1).getName() + " health: " + list.get(userChar - 1).getHealth());
                System.out.println(list.get(oppChar - 1).getName() + " health: " + list.get(oppChar - 1).getHealth());
                break;
            }
            catch (Exception e) {
                String str = scan.next();
                System.out.println("Please enter a number.");
            }
        }
    }
}