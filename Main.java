public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Item item = new Item("Item name", "Item description", 10);
        System.out.println(item.toString());

        Weapon weapon = new Weapon("Weapon name", "Weapon description", 20, 8);
        System.out.println(weapon.str());

        Gold gold = new Gold(24);
        System.out.println(gold.toString());

        Sword sword = new Sword();
        System.out.println(sword.toString());
        System.out.println(sword.str());

        Pillow pillow = new Pillow();
        System.out.println(pillow.toString());
        System.out.println(pillow.str());

        Mace mace = new Mace();
        System.out.println(mace.str());

        Arrow arrow = new Arrow();
        System.out.println(arrow.str());


        Gold goldBar = new Gold("Gold Bar", "1KG Gold Bar", 200);
        System.out.println(goldBar.toString());

        Sword magicSword = new Sword("Magic Sword", "A sword with magical features and more dangerous than a normal sword", 40, 76);
        System.out.println(magicSword.str());

        Pillow softPillow = new Pillow("Soft Pillow", "A soft pillow with very low damage. Used on friends!", 1, 1);
        System.out.println(softPillow.str());

        Mace bigMace = new Mace("Big Mace", "A very big Mace with lethal damage. Used to kill or harm someone", 300, 99);
        System.out.println(bigMace.str());

    }

}