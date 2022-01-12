public class Knight extends Hero {
    private int defence;

    public Knight(String name) {
        super(name);
        this.defence = 15;
        this.attack = 20;
    }

    public void damage(int dmg){
        dmg -=defence;
        if(dmg > 0)
            super.damage(dmg);
    }

    public void attack(Monster monster){
        super.attack(monster);
    }
}
