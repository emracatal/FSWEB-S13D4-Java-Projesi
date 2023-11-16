public enum Weapon {
    WEAPON1("WEAPON1", 10, 1.8),
    WEAPON2("WEAPON2", 15, 1.5),
    WEAPON3("WEAPON3", 20, 1.2);

    private String name;
    private int damage;
    private double speed;

    Weapon(String name,int damage,double speed) {
        this.name = name;
        this.damage = damage;
        this.speed = speed;
    }
    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }

    public double getSpeed(){
        return speed;
    }
}