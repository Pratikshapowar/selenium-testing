package JavaPractice;

public class Unitconversion {
    public static void main(String[] args){
        int a = 2;
        int Dist=12; int temp=47;
        switch (a){
            case 1: System.out.println("Distance in meters:"+ (Dist*1000));
            break;
            case 2: System.out.println("Temperature in celcius:"+((temp-32)*5/9));
            break;
            default:System.out.println("None of the above");
            break;
        }
    }
}
