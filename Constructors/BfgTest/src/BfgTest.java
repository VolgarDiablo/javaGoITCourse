//Створи клас BFG, у якого буде три поля:
//        int ammo - тут зберігаються патрони, за замовчуванням 1000;
//        int damage - тут зберігається шкода, що наноситься зброєю, за замовчуванням 50;
//        String name - тут зберігається ім'я зброї, за замовчуванням BFG.
//        Створи геттери для кожного поля.
//
//        У класу має бути 4 конструктори:
//        BFG(int ammo, int damage, String name) - задаємо значення всім параметрам;
//        BFG(int ammo, int damage) - задаємо значення лише двох параметрів, кількості патронів та шкоди, поле name ініціалізується значенням за замовчуванням;
//        BFG(int ammo) - задаємо значення лише кількості патронів, шкода та ім'я ініціалізується за замовчуванням;
//        BFG() - конструктор без параметрів, тут полям ammo, damage та name задаються значення за замовчуванням.
//        Також перевизнач метод toString(), щоб він повертав для класу BFG рядок у форматі <NAME>, ammo: <AMMO>, damage: <DAMAGE>. Замість <NAME>, <AMMO>,
//<DAMAGE> підставляються значення полів name, value та damage.
public class BfgTest {
    public static void main(String[] args) {
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG());
    }
}