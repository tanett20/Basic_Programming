/*
Задача 1
Давайте представим, что мы пишем программу для ветеринарной клиники. Создайте класс Pet(Домашнее животное)
Поля: тип (кот, собака, попугай и т.д.), имя, цвет, возраст Реализуйте конструктор, toString()
Реализуйте метод, который позволяет создать объект Pet используя Scanner
 */



package app;

import java.util.Date;

public class Main {

    public static void main(String[] args) {


        BankAccount account1 = new BankAccount("DE12341234",
                1000,
                new Person("Jack","Jackson", new MyDate(10, 2,2008) ),
                new MyDate(20,6,2024));

        BankAccount account2 = new BankAccount("DE88888888",
                1000,
                new Person("Oleg","Olegov", new MyDate(1, 11,2003) ),
                new MyDate(20,6,2024));


        BankAccount[] accountsArr = {account1,account2,
                new BankAccount("DE12345678",10353.3, new Person("Nick","White", new MyDate(10,3,1993)),new MyDate(12,12,2024))  };



        for (int i = 0; i < accountsArr.length ; i++) {
            System.out.println(accountsArr[i]);
        }
        System.out.println("------------------");
        account1.iban = "1234567890-=";
        System.out.println(accountsArr[0]);






    }








}

