public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;
    private int hit;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        checkHealth(healthPercentage);
        this.weapon = weapon;
            }

    public void checkHealth(int healthPercentage) {
        if (healthPercentage < 0) {
            this.healthPercentage = 0;
        }

        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        int healthRemain = healthPercentage - damage;
        if (healthRemain <= 0) {
            System.out.println(name + " player has been knocked out of game");
        }
        healthPercentage = healthRemain;
        checkHealth(this.healthPercentage);
    }

    public void restoreHealth(int healthPotion) {
        this.healthPercentage += healthPotion;
        checkHealth(this.healthPercentage);
    }

    public static void fight(Player p1, Player p2, int hit) {
        p1.healthPercentage = p1.healthPercentage + hit;
        p1.checkHealth(p1.healthPercentage);
        p2.healthPercentage = p2.healthPercentage - hit;
        p2.checkHealth(p2.healthPercentage);

        System.out.println(p1.name+" "+hit+" hit "+p2.name+". Result "+p1.name+": "+p1.healthRemaining()+". Result "+p2.name+": "+p2.healthRemaining());
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
