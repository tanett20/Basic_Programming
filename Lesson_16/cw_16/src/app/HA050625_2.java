/*
Задача 2
В программе задано 2 функции: adminLogin и adminPass. Пользователь вводит свои логин и пароль.
Если введенные логин и пароль совпадают с adminLogin и adminPass, программа выдает сообщение:
«доступ возможен», иначе «вы не опознаны»
 */

package app;

import java.util.Scanner;

public class HA050625_2 {
    public static void main(String[] args) {

        String adminLogin = "nosenko";
        String adminPass = "2020";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        System.out.print("Введите пароль: ");
        String pass = scanner.nextLine();

        if (login.equals(adminLogin) && pass.equals(adminPass)) {
            System.out.println("Доступ возможен");
        } else {
            System.out.println("Вы не опознаны");
        }


    }
}
