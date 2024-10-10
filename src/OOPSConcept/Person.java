package OOPSConcept;

public class Person {
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
    //no argument no returntype
    void setageandid(){
        System.out.println("age of P1 is:" + "20");
    }
    //no argument with return type
    String setname() {
        return ("ABC");
    }
    //Withargument and return typ
    char setgender(String name1){
            System.out.println("I am method with argument and return type");
            return('M');
    }
    //with argument and no return Type
    void setWeight(Float weight1) {
        System.out.println("weight of p1 is" + weight1);
    }
        public static void main(String[] args){
 Person P1 = new Person();
 P1.setageandid();
 String name = P1.setname();
 System.out.println("name of p1 is :"+ name);
 char G=P1.setgender("ABC");
 P1.setWeight(54.5f);



        }
    }

