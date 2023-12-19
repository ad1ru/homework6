package kg.geeks.hm6;

public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss Health: " + getHp() +
                "\nBoss Damage: " + getDamage() +
                "\nWeapon Type: " + weapon.getType() +
                "\nWeapon Name: " + weapon.getName();
    }
}
