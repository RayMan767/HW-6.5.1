public class Monster {
    public String getName() {
        return name;
    }

    private String name;
    private int health;
    private int attack;
    private boolean isAlive = true;

    public Monster(int health, int attack, String name) {
        this.health = health;
        this.attack = attack;
        this.name = name;
        System.out.println("The monster " + name + " came!");

    }

    public void attack(Hero hero){
        // Esli jivoi to b'em
        if(hero.alive()) {
            hero.damage(this.attack);
            System.out.println("The monster "+ this.name +" deal "+ this.attack + " damage " + hero.getName() + ".");
            if(!hero.alive())
                System.out.println("The hero died!");
        }
        else
            System.out.println("The hero has already died!");
    }

    public boolean alive(){
        if(this.health < 1)
            isAlive = false;
        return isAlive;
    }
    public void damage(int dmg){
        this.health -= dmg;

    }
}
