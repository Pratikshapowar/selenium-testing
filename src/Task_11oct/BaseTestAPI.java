package Task_11oct;

abstract class BaseTestAPI {
    int age;
    String name;

    void performGET(){
        System.out.println("Inside peformGet");

    }
    void performPOST(){
System.out.println("Inside performPOST");
    }
   void performPATCH(){
       System.out.println("Inside performPUT");
   }
    void performPUT(){
        System.out.println("Inside performPUT");
    }
    abstract void performDELETE();
    BaseTestAPI(int age,String name){
this.age=age;
this.name=name;
System.out.println(age);
System.out.println(name);
    }
}
