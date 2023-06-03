//Напиши клас SpaceRocketLauncher, який описує космічну ракетну установку.
//
//        У цього класу повинні бути наступні приватні поля:
//
//        bigRocketCount - тип int, кількість великих ракет
//        smallRocketCount - тип int, кількість маленьких ракет
//        Для обох полів зроби сеттери та геттери. Напиши сеттери так, щоб якщо ми передаємо кількість ракет менше 0 або ж більше 100,
//        то такий виклик би ігнорувався.
//
//        Також напиши у класі такі методи:
//
//public void launchBigRocket(). Цей метод перевіряє кількість великих ракет (bigRocketCount),
//        і якщо ця кількість більше 0 - забирає одну ракету у поля bigRocketCount, і виводить у консоль текст "Launch big rocket".
//public void launchSmallRocket(). Цей метод перевіряє кількість маленьких ракет (smallRocketCount),
//        і якщо ця кількість більше 0 - забирає одну ракету у поля smallRocketCount, і виводить у консоль текст "Launch small rocket".
//public int getTotalPower(). Цей метод рахує загальну вогневу міць ракетної установки з розрахунку,
//        що кожна велика ракета, що залишилася, дає 100 одиниць міці, кожна маленька ракета - 50 одиниць міці.
public class SpaceRocketLauncher {
    private int bigRocketCount;
    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount < 0 || bigRocketCount > 100) return;
        this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount < 0 || smallRocketCount > 100) return;
        this.smallRocketCount = smallRocketCount;
    }

    public void launchBigRocket() {
        if (bigRocketCount > 0) {
            bigRocketCount--;
            System.out.println("Launch big rocket");
        }
    }

    public void launchSmallRocket() {
        if (smallRocketCount > 0) {
            smallRocketCount--;
            System.out.println("Launch small rocket");
        }
    }

    public int getTotalPower() {
        return bigRocketCount * 100 + smallRocketCount * 50;
    }

    public static void main(String[] args) {
        SpaceRocketLauncher launcher = new SpaceRocketLauncher();
        launcher.setBigRocketCount(5);
        launcher.setSmallRocketCount(10);

        System.out.println("Power is " + launcher.getTotalPower());

        launcher.launchBigRocket();
        System.out.println("Big rocket count is " + launcher.getBigRocketCount());

        launcher.launchSmallRocket();
        System.out.println("Small rocket count is " + launcher.getSmallRocketCount());

        System.out.println("Power is " + launcher.getTotalPower());
    }
}