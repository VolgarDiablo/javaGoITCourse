public class Hero {
    private String name;
    private int hp;

    public Hero() {
        this("Paratrooper", 100);
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        if (hp > 200) {
            this.hp = 200;
        }
        if (hp < 0) {
            this.hp = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}