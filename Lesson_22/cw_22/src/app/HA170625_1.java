/*

Задача 1
В записях метод void printDate(int day, int month, int year), который получает 3 значения int
и выводит на экран сегодня, в следующем виде:

год месяц число

Например:
printDate(15,1,2008)
Вывод: 2008 январь 15
в рамках данной задачи предполагается, что данные корректны

 */



package app;

public class HA170625 {
    public static void main(String[] args) {
        printDate(15, 1, 2008);
    }

    public static void printDate(int day, int month, int year) {
                String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"
        };


    }
}
