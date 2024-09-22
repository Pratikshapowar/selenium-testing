package JavaPractice;

public class Task_20Sept {
    public static void main(String[] args){
        int a= 10, b=20, c=30;
        int d =a>b?a:b;
        System.out.println(d);
        int e =d>c?d:c;
        System.out.println("gretest of three no is"+ e);
        int Grn= a>b?a>c?a:c:b>c?b:c;
        System.out.println("Greater of three no is " +Grn);

    }
}
