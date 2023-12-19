package kg.geeks.hm6;

public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setType(WeaponType.SPEAR);
        bossWeapon.setName("Infinity Pain");

        Weapon skeletonWeapon = new Weapon();
        skeletonWeapon.setType(WeaponType.CROSSBOW);
        skeletonWeapon.setName("Deadly Crossbow");

        Boss boss = new Boss();
        boss.setDamage(35);
        boss.setHp(200);
        boss.setWeapon(bossWeapon);

        System.out.println("Boss info:\n" + boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHp(100);
        skeleton1.setDamage(15);
        skeleton1.setWeapon(skeletonWeapon);
        skeleton1.setArrows(14);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHp(100);
        skeleton2.setDamage(15);
        skeleton2.setWeapon(skeletonWeapon);
        skeleton2.setArrows(10);

        System.out.println("\nSkeleton 1 Info:\n" + skeleton1.printInfo());
        System.out.println("\nSkeleton 2 Info:\n" + skeleton2.printInfo());
    }
}