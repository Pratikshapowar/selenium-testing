package OOPSConcept;

public class Person1 {
    int age;
    int id;
    String name;
    char Gender;
    String color;
    String planet;
    String haircolor;
    Float weight;
    String add;
    float height;

    Person1() {
        System.out.println("Inside default constructor");
        age = 25;
        id = 1234;
        name = "XYZ";
        Gender = 'F';
    }

    Person1(String Color, String Planet, float Weight) {
        System.out.println("Inside parameterized constructor");
        this.color = Color;
        this.planet = Planet;
        this.weight = Weight;
    }
    void walking(){
        System.out.println("Person1 is walking");
    }
    int running(){
        System.out.println("Person1 is running");
        return(4);
    }
    void eating(String dish){
        System.out.println("Person1 is eating : "+dish);
    }
    int driving(String vehicle){
        System.out.println("Person1 is Driving : "+vehicle);
        return(2);
    }
    public static void main(String[] args) {
        Person1 P2 = new Person1();
        Person1 P3 = new Person1("Gray","Earth",55.3f);
        System.out.println("Color of Person1 is : " + P3.color);
        Person1 P4 = new Person1();
        P4.walking();
        P4.running();

        Person1 P5 = new Person1();
        P5.eating("pizza");
        P5.driving("Splendor");

    }
}
