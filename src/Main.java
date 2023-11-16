public class Main {
    public static void main(String[] args) {
        System.out.println("*********************************");
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());
        System.out.println("*********************************");
        Player emra = new Player("emra",50,Weapon.WEAPON1);
        Player kaan=new Player("kaan",20,Weapon.WEAPON3);
        emra.loseHealth(55);
        System.out.println(emra);
        emra.restoreHealth(20);
        System.out.println(emra);
        kaan.restoreHealth(500);
        System.out.println(kaan);
    }
}