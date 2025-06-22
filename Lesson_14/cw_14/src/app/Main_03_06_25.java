package app;

public class Main_03_06_25 {
    public static void main(String[] args) {

    long a = 12345666677888L; // L при объявлении long
    int b = 1_234_546_789; // _ для разделения разрядов
    float f = 7762.7F; // F для объявления float
    boolean isOk = false; // true / fakse

    int i1 = 10;
    double d1 = i1;
    System.out.println("d1 = " + d1); // 10.0 / можно в дробную переменную вставить целочисленную, но не наоборот!!!

    // i1 = d1 // ошибка / double нельзя положить в int

        System.out.println("============================");

    double d2 = 19.783;
    int i2 = (int) d2; // (int) явное преобразование типа данных переменной к типу int

    System.out.println("i2 = " + i2);

        System.out.println("============================");

        int i3 = 129; // получается отрицательное число при перевыполнении
        byte b1 = (byte) i3;

        System.out.println("b1 = " + b1);

    char chA = 'A'; // одинарные кавычки, хранится число

        /*
        65 - A
        66 - B
        67 - C
        таблица ASCII
         */


    int intChA = (int) chA;
        System.out.println("Символ '" + chA + "'  имеет код - " + intChA);

        System.out.println((char) (chA + 1));


        int diff = 32;
        System.out.println((char) (chA + diff) );
        System.out.println((chA + diff) );


        // String s1 = new String("hello")

        String str = "hello "; // используем двойные кавычки
        System.out.println(str);

        String str2 = " Java";
        System.out.println(str + str2);
        System.out.println(str + " " + str2);


        System.out.println(str + 2);  //"hello2"

        double f = 10.5;
        System.out.println(str+f); //"htllo" + "10.5" - "hello10.5"

        boolean isOk = true;
        System.out.println(str+isOk); // "hello" + "true" - "hellotrue"

        String myString = "Hello Java world";

        System.out.println("----------------------------------------");
        String myString = "Hello Java world";
        int length = myString.length();  // сколько символов в строке myString

        System.out.println("Строка: " + myString);
        System.out.println("Длинна строки: " + length);



    }
}
