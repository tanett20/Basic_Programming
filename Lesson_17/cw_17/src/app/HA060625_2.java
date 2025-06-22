/*

Задача 2
В написании программы, которая просит пользователя ввести два числа и выбрать операцию «умножить», «сложить»,
«вычесть» или «поделить». В качестве результата система должна привести следующий вид:

3 * 3 = 9

Естественно, число и операция должны зависеть от введенных данных.

 */


package app;

import java.util.Scanner;

public class HA060625_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите операцию (сложить, вычесть, умножить, поделить): ");
        String operation = scanner.nextLine();

        if (operation.equals("сложить")) {
            result = num1 + num2;

        } else if (operation.equals("вычесть")) {
            result = num1 - num2;

        } else if (operation.equals("умножить")) {
            result = num1 * num2;

        } else if (operation.equals("поделить")) {
            if (num2 == 0) {
                System.out.println("Ошибка: деление на ноль нельзя!");

            result = num1 / num2;

        } else {
                System.out.println("Ошибка: нельзя выполнить операцию!");
            }

        }

    }


