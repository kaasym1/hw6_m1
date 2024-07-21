public class Boss extends GameEntity {

    Weapon weapon;
    Weapon bossWeapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printInfo(){
        return super.printInfo() + " | Weapon " + weapon + " | BossWeapon " + bossWeapon;
    }
}