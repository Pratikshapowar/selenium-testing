package Task_25thSept;

public class Factorial {
    public static void main(String[] args){
        int num=5;
        int i=num;
        int fact=1;
        while(i>=1){
            fact=fact*i;
            i--;
        }
        System.out.println("Factorial is :"+fact);
    }
}
