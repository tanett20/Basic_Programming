/*

Задача 1
Напишите программу, которая запрашивает у пользователя номер месяца и выводит название введенного месяца:

Введите номер месяца:
3
Месяц номер 3: март

 */

package app;

import java.util.Scanner;

public class HA060625_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца [1. январь 2. ...12. декабрь.]: ");

        int month = scanner.nextInt();

        if (month == 1){
            System.out.println("Месяц номер 1: январь");
        } else if (month == 2){
            System.out.println("Месяц номер 2: февраль");
        } else if (month == 3){
            System.out.println("Месяц номер 3: март");
        } else if (month == 4) {
            System.out.println("Месяц номер 4: апрель");
        } else if (month == 5) {
            System.out.println("Месяц номер 5: май");
        } else if (month == 6) {
            System.out.println("Месяц номер 6: июнь");
        } else if (month == 7) {
            System.out.println("Месяц номер 7: июль");
        } else if (month == 8) {
            System.out.println("Месяц номер 8: август");
        } else if (month == 9) {
            System.out.println("Месяц номер 9: сентябрь");
        } else if (month == 10) {
            System.out.println("Месяц номер 10: октябрь");
        } else if (month == 11) {
            System.out.println("Месяц номер 11: ноябрь");
        } else if (month == 12) {
            System.out.println("Месяц номер 12: декабрь");
        } else {
            System.out.println("ошибка ввода");
        }

        /*
        switch (variable ) {
            case value1 :
            case value2 :
            case value3 :
                .......
            default:

        }
        */
        System.out.println("Второй способ: switch ..... case .......");
        switch (month){
            case 1: System.out.println("Январь"); break;
            case 2: System.out.println("Февраль"); break;
            case 3: System.out.println("Март"); break;
            case 4: System.out.println("Апрель"); break;
            case 5: System.out.println("Май"); break;
            case 6: System.out.println("Июнь"); break;
            case 7: System.out.println("Июль"); break;
            case 8: System.out.println("Август"); break;
            case 9: System.out.println("Сентябрь"); break;
            case 10: System.out.println("Октябрь"); break;
            case 11: System.out.println("Ноябрь"); break;
            case 12: System.out.println("Декабрь"); break;
            default:  System.out.println("Ошибка ввода");

        }





    }



}
