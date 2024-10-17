package Task_11oct;

public class TestCasesAPI extends BaseTestAPI{
    @Override
    void performDELETE() {
        System.out.println("performDelete");

    }

    TestCasesAPI(int age, String name){
        super(5,"XYZ");
        System.out.println("Child class Constuctor");
        System.out.println(age);
        System.out.println(name);


    }

}
