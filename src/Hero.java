public class Hero {
    public String getName() {
        return name;
    }

    protected String name;
    protected int health;
    protected int attack;
    protected boolean isAlive = true;

    public Hero(String name) {
        this.health = 40;
        this.attack = 5;
        this.name = name;
        System.out.println("The hero "+ name +" is here!");
    }

    public void attack(Monster monster){
        // Esli jivoi to b'em
        if(monster.alive()) {
            monster.damage(this.attack);
            System.out.println("The hero "+ this.name +" deal "+ this.attack + " damage " + monster.getName() + ".");
            if(!monster.alive())
                System.out.println("The monster died!");
        }
        else
            System.out.println("The monster has already died!");
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
