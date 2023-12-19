package kg.geeks.hm6;

public class Skeleton extends Boss {
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public String printInfo() {
        return "Skeleton Health: " + getHp() +
                "\nSkeleton Damage: " + getDamage() +
                "\nWeapon Type: " + getWeapon().getType() +
                "\nWeapon Name: " + getWeapon().getName() +
                "\nArrow Count: " + arrows;
    }
}
