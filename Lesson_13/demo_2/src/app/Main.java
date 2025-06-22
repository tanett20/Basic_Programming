package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Super!!!!");

        int numberOffPeopleInGroup = 14;
        double weigtOffCat = 4.8;

        byte numberDay;
        numberDay = 1;

        System.out.println("Количество людей " + numberOffPeopleInGroup);
        System.out.println("Вес кота " + weigtOffCat);

        int numberOffPeopleInSubGroup = 4;
        weigtOffCat = weigtOffCat + 1; // weigtOffCat += 1

        System.out.println("Новый вес кота " + weigtOffCat);

        int numberOffSubGroups = numberOffPeopleInGroup / numberOffPeopleInSubGroup; // целочисленное деление
        System.out.println("Количество подгрупп: " + numberOffSubGroups);

        int a = 17;
        int b = 5;
        int res1 = a / b; // целочисленное деление
        int ostatok = a % b; // остаток от деления

        System.out.println("res1: " + res1);
        System.out.println("Остаток от деления: " + ostatok);

        double x = 17;
        double y = 5;

        double res2 = x / y;

        System.out.println("res2: " + res2);



    }
}
