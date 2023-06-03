import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class NumberTranslator {
//    public String drawQuad(int n) {
//        int count = n * n;
//        int iter = 0;
//        String str = "";
//        while (iter < count) {
//            str += "*";
//            iter++;
//            if (iter % n == 0) {
//                str += "\n";
//            }
//        }
//        return str;
//    }
//
//    public String drawRect(int width, int height, char c) {
//        String str = "";
//        int count = width * height;
//        int iter = 0;
//        while (iter < count) {
//            str += c;
//            iter++;
//            if (iter % width == 0) {
//                str += "\n";
//            }
//        }
//
//        return str;
//    }
//
//    public String drawLine(int length) {
//        String str = "";
//        int iter = 1;
//        while (length > 0) {
//            if (iter % 2 != 0) {
//                str += "*";
//            } else str += "#";
//            iter++;
//            length--;
//        }
//
//        return str;
//    }
//
//    public String drawPattern(char[] pattern, int repeatCount) {
//        String str = "";
//        int fullIter = 0;
//        int index = 0;
//
//        while (fullIter < repeatCount) {
//            str += pattern[index];
//            index++;
//            if (index == pattern.length) {
//                index = 0;
//                fullIter++;
//            }
//        }
//        return str;
//    }
//
//    public String drawTriangle(int side) {
//        String str = "";
//
//        while (side > 0) {
//            str += "*".repeat(side) + "\n";
//            side--;
//        }
//        return str;
//    }
//
//    public int sumQuads(int n) {
//        int sum = 0;
//        while (n > 0) {
//            sum += n % 10;
//            n = n / 10;
//        }
//        return sum;
//    }
//
//    //500, 200, 100, 50, 20, 10, 5, 2 ,1
//    public int countBanknotes(int sum){
//        int countOfCash = 0, currentNumber = sum;
//
//        countOfCash += currentNumber / 500;
//        currentNumber %= 500;
//
//        countOfCash += currentNumber / 200;
//        currentNumber %= 200;
//
//        countOfCash += currentNumber / 100;
//        currentNumber %= 100;
//
//        countOfCash += currentNumber / 50;
//        currentNumber %= 50;
//
//        countOfCash += currentNumber / 20;
//        currentNumber %= 20;
//
//        countOfCash += currentNumber / 10;
//        currentNumber %= 10;
//
//        countOfCash += currentNumber / 5;
//        currentNumber %= 5;
//
//        countOfCash += currentNumber / 2;
//        currentNumber %= 2;
//
//        countOfCash += currentNumber;
//
//        return countOfCash;
//    }
//    //Test output
//    public static void main(String[] args) {
//        NumberTranslator bank = new NumberTranslator();
//        System.out.println(bank.countBanknotes(548));
//    }
    public static void main(String[] args) {
        String translate = " X i ";
        translate = translate.toLowerCase().replace(" ","");
        switch (translate) {
            case "i" -> System.out.println(1);
            case "ii" -> System.out.println(2);
            case "iii" -> System.out.println(3);
            case "iv" -> System.out.println(4);
            case "v" -> System.out.println(5);
            case "vi" -> System.out.println(6);
            case "vii" -> System.out.println(7);
            case "viii" -> System.out.println(8);
            case "ix" -> System.out.println(9);
            case "x" -> System.out.println(10);
            case "xi" -> System.out.println(11);
            case "xii" -> System.out.println(12);
            default -> System.out.println(-1);
        }
    }
}