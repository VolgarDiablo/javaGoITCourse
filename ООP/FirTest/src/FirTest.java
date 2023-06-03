//Створи клас FirNum. У цього класу створи метод public int calc(int n). Він приймає ціле число,
//        і повертає його. Це буде основа для всіх подальших алгоритмів.
//
//        виклик new FirNum().calc(10) повертає 10

//Створи клас FirNumSum, який успадковується від класу FirNum. Перевизнач у цього класу метод calc() так,
//        щоб він повертав суму чисел від 1 до переданого параметра n включно.
//
//        виклик new FirNumSum().calc(3) повертає 6
//
//Створи клас FirNumFactorial, який успадковується від класу FirNum. Перевизнач у цього класу метод calc() так, щоб він повертав факторіал n.
//
//        виклик new FirNumFactorial().calc(4) повертає 24
//        виклик new FirNumFactorial().calc(0) повертає 1

//Створи клас FirNumMultiplyOdd, який успадковується від класу FirNum.
//        Перевизнач у цього класу метод calc() так, щоб він повертав добуток непарних чисел від 1 до n включно.

//Створи клас FirNumFizzBuzz, який успадковується від класу FirNum. Перевизнач у цього класу метод calc() так,
//        щоб він повертав суму чисел від 1 до n включно згідно алгоритму FizzBuzz.
//
//        виклик new FirNumFizzBuzz().calc(20) повертає 83

//Створи клас FirNumBasis, який успадковується від класу FirNum. Перевизнач у цього класу метод calc() так,
//        шоб він повертав фірський базис числа n включно згідно алгоритму, описаному в теорії.
public class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
//        FirNum firNum = new FirNum();
//        FirTest firTest = new FirTest();
//
//        //Should be 10
//        System.out.println(firTest.test(firNum, 10));

//        FirNum firNum = new FirNumSum();
//        FirTest firTest = new FirTest();
//
//        //Should be 6
//        System.out.println(firTest.test(firNum, 3));

//        FirNum firNum = new FirNumFactorial();
//        FirTest firTest = new FirTest();
//
//        //Should be 120
//        System.out.println(firTest.test(firNum, 5));
//
//        FirNum firNum = new FirNumMultiplyOdd();
//        FirTest firTest = new FirTest();
//
//        //Should be 15
//        System.out.println(firTest.test(firNum, 5));

//        FirNum firNum = new FirNumFizzBuzz();
//        FirTest firTest = new FirTest();
//
//        //Should be 83
//        System.out.println(firTest.test(firNum, 20));

        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 10
        System.out.println(firTest.test(firNum, 9));
    }
}