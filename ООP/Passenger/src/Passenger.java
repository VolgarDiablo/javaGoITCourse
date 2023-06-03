//зроби два класи, кожен із яких успадковується від класу Passenger. У кожному класі реалізуй методи String getType() та int getTicketPrice().
//Перший клас має називатися RegularPassenger. У цього класу метод getType() повинен повертати рядок "Regular", метод getTicketPrice() повертати число 199.
//
//        Другий клас має називатися VIPPassenger. Метод getType() цього класу повинен повертати рядок "VIP", метод getTicketPrice() - повертати число 399.
abstract class Passenger {
    public abstract String getType();

    public abstract int getTicketPrice();
}