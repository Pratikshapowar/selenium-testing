package Task_14thOct;

public class PrintmyBook extends Book {
    String name;
    String Author;
    int price;
    PrintmyBook(String name, String Author, int price){
        this.name=name;
        this.Author=Author;
        this.price=price;
    }

    @Override
    void getDetails() {
        System.out.println("Name of the book is:"+name);
        System.out.println("Author is "+Author);
        System.out.println("Price: "+price);
    }
}
