public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(400);
        boss.setDamage(50);
        boss.bossWeapon.setWeaponType(WeaponType.BOMB);
        boss.bossWeapon.setWeaponName("Atom");
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(100);
        skeleton1.setDamage(20);
        skeleton1.setNumberOfArrows(300);
        System.out.println(skeleton1.printInfo());

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(99);
        skeleton2.setDamage(19);
        skeleton2.setNumberOfArrows(250);
        System.out.println(skeleton2.printInfo());
    }
}