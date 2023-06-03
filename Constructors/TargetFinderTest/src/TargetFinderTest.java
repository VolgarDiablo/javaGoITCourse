import java.util.Arrays;

//Напиши клас TargetFinder. Цей клас має метод public int[] findTarget(int[] aiCoords, int[][] targets). Цей метод приймає два параметри:
//        aiCoords - координати точки, де зараз перебуває ШІ. Це масив із двох елементів, x та y відповідно;
//        targets - двомірний масив. Кожен елемент масиву - це масив із двох елементів, x та y потенційної цілі відповідно.
//        Метод повертає точку найближчої цілі з масиву targets. Це масив із двох точок - x та y відповідно.
class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}