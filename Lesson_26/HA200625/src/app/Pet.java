package app;

public class Pet {

    String Typ;
    String Name;
    String Color;
    String Age;


    public Pet(String Typ, String Name, String Color, String Age){
        this.Typ = Typ;
        this.Name = Name;
        this. Color = Color;
        this. Age = Age;
    }



    public  String toString(){
        return Typ + ", " + Name + ", " + Color + ", " + Age + ".";
    }

}
