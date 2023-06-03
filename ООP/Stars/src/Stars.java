//У Міжгалактичній Гільдії Космоходців зірки прийнято рахувати таким чином:
//
//        1000 зірок записуються символом X;
//        100 зірок записуються символом Y;
//        10 зірок записуються символом Z;
//        1 зірка записується символом *.
//        Таким чином, будь-яке число зірок можна перевести в такий, зрозумілий всім учасникам гільдії, запис.
//
//        Декілька прикладів:
//
//        1001 зірка - це X*;
//        576 зірок - це YYYYYZZZZZZZ******
//        Потрібно використовувати мінімальну кількість символів. Тобто, наприклад, 101 зірку треба подати у вигляді Y*, але не у вигляді ZZZZZZZZZZ*.
//
//        На заводі, де ти фрілансиш, тебе попросили написати клас для такого запису числа зірок

//Напиши клас Stars. У цьому класі оголоси поле count типу int - кількість зірок.
//
//        Перевизнач у класі Stars метод toString(). Він повинен повертати кількість зірок у прийнятому у Міжгалактичній Гільдії Космоходців форматі.
public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        int number = this.count;
        int count = 0;
        String str = "";
        String count1000 = "X", count100 = "Y", count10 = "Z", count1 = "*";

        str += count1000.repeat(number / 1000);
        number %= 1000;
        str += count100.repeat(number / 100);
        number %= 100;
        str += count10.repeat(number / 10);
        number %= 10;
        str += count1.repeat(number);

        return str;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}