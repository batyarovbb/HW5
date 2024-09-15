public class Main {

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Fireball");
        Hero hero2 = new Hero(120, 25);
        Hero hero3 = new Hero(150, 30, "Invisibility");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefenseType("Magical Shield");

        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();

        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: " + hero.getDamage() + ", Super Power: " + hero.getSuperPower());
        }
    }
}
