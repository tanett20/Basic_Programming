package app;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }


    // static - не нужно!!!
    public  String toString(){
        return day + "/" + month + "/" + year;
    }

    public String getMonthName(){
        switch (month){
            case 1: return "Январь";
            case 2: return "Февраль";
            case 3: return "Март";
            case 4: return "Апрель";
            case 5: return "Май";
            case 6: return "Июнь";
            case 7: return "Июль";
            case 8: return "Август";
            case 9: return "Сентябрь";
            case 10: return "Октяюрь";
            case 11: return "Ноябрь";
            case 12: return "Декабрь";
            default: return "";
        }
    }


}
