package Task_11oct;

public class RunnerApi {
    public static void main(String[] args){
        TestCasesAPI tc=new TestCasesAPI(2,"ABC");
        tc.performDELETE();
        tc.performGET();
        tc.performPATCH();
        tc.performPOST();
        tc.performPUT();

    }
}
