//Виправи клас AvgDamageCalculator, дописавши метод calculateAvg() так, щоб якщо ми передаємо порожній масив і відбувається поділ на 0,
//        то ця виняткова ситуація обробилася, і метод повернув значення 0.
//        Не використовуй умовні оператори if, використовуй саме обробку винятків try...catch.
class AvgDamageCalculatorTest {
    public static void main(String[] args) {
        //5
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}));

        //0
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }
}