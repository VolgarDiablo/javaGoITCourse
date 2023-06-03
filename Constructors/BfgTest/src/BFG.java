public class BFG {
    private final int ammo;
    private final int damage;
    private final String name;

    public BFG(int ammo, int damage, String name) {
        this.ammo = ammo;
        this.damage = damage;
        this.name = name;
    }

    public BFG(int ammo, int damage) {
        this(ammo, damage, "BFG");
    }

    public BFG(int ammo) {
        this(ammo, 50, "BFG");
    }

    public BFG() {
        this(1000, 50, "BFG");
    }

    @Override
    public String toString() {
        return getName() + ", ammo: " + getAmmo() + ", damage: " + getDamage();
    }

    public int getAmmo() {
        return ammo;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}