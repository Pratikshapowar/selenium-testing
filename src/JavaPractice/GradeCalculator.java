package JavaPractice;

public class GradeCalculator {
    public static void main(String[] args){
        int marks = 56;
        String grade = (marks>=90)?"A":(marks>=80)?"B":(marks>=70)?"C":"Fail";
        System.out.println("grade of student is "+grade);
    }
}
