public class Main {

    public static void main(String[] args) {
        Monster monster = new Monster(60,20,"Azog");
        Hero hero = new Hero("Igor");

        hero.attack(monster);
        monster.attack(hero);
        hero.attack(monster);
        monster.attack(hero);

        Knight knight = new Knight("Richard");

        knight.attack(monster);
        monster.attack(knight);
        knight.attack(monster);
        monster.attack(knight);
        knight.attack(monster);

    }
}
