package JavaPractice;

public class Calculator {
public static void main(String[] args){
    int a=18, b=9;
    String choice = "Modulus";
    switch (choice){
       case "Addition" : System.out.println("Addition of a and b"+(a+b));
       break;
        case "Subtraction" : System.out.println("Subtraction of a and b"+(a-b));
            break;
        case "Multiplication" : System.out.println("Multiplication of a and b"+(a*b));
            break;
        case "Division" : System.out.println("Division of a and b"+(a/b));
            break;
        case "Modulus" : System.out.println("Addition of a and b"+(a%b));
            break;
        default: System.out.println("None of the above");
        break;


    }


}
}
