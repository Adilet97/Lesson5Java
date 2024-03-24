
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setTypeOfDefense("Shield");
        System.out.println("Boss's health: " + boss.getHealth());
        System.out.println("Boss's damage: " + boss.getDamage());
        System.out.println("Boss's defense type: " + boss.getTypeOfDefense());


        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: " + hero.getDamage() + ", Power: " + hero.getPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(150, 30, "Flight");
        heroes[1] = new Hero(180, 30);
        heroes[2] = new Hero(60, 30, "Invisibility");
        return heroes;
    }

}