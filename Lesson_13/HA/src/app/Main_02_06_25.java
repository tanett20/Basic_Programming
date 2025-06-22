/*
Задание 1
Создайте новый модуль. В модуле создайте пакет c названием app. Создай новый класс. Создать метод main.
Исходные данные: Цена за один билет в кино составляет 4 у.е. У вас 19 y.e.

В записной программе, которая сохраняет эти данные в функции, вычисляет и выводит в консоль, сколько билетов вы можете купить.
Сколько денег вы потеряете после покупки максимально возможного количества билетов.
 */



package app;

public class Main_02_06_25 {
    public static void main(String[] args) {

        int ticketPrice = 4;
        int availableMoney = 19;

        int availableTickets = availableMoney / ticketPrice;
        int rest = availableMoney % ticketPrice;

        System.out.println("Доступно билетов: " + availableTickets);
        System.out.println("Остаток денег: " + rest);

        System.out.println("======================================");

    /*
    Задание 2
    Создай новый класс. Создать метод main. Объявите 2 переменных:

    цена товара без налога;
    налог
    Напишите программу, которая вычисляет цену товара с налогом.

    Например, так:
    Введите цену товара: 200.0
    Налон составит: 19
    Цена с налогом 238.0

        */

        double price = 200.0;
        double taxPercent = 19;

        double tax = price / 100 * taxPercent;
        double priceWithTax = price + tax;
        System.out.println("Цена товара: " + price);
        System.out.println("Налог %: " + taxPercent + "%");
        System.out.println("Сумма налога : " + tax);
        System.out.println("Цена с налогом: " + priceWithTax);


    }
}
