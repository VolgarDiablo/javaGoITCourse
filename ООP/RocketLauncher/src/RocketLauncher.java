//Перевизнач метод toString(), щоб при виведенні об'єкта класу RocketLauncher у консоль виводився рядок виду "Size is <size>,
//        rocket count is <rocketCount>". Замість <size> підстав значення поля size, замість <rocketCount> - значення поля rocketCount.
class RocketLauncher {
    private String size;
    private int rocketCount;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }

    @Override
    public String toString() {
        return "Size is " + this.size + ", rocket count is " + rocketCount;
    }

    public static void main(String[] args) {
        RocketLauncher launcher = new RocketLauncher();
        launcher.setSize("big");
        launcher.setRocketCount(50);

        //Should be - Size is big, rocket count is 50
        System.out.println(launcher);
    }
}