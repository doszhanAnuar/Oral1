public class Reader {
    private String nameAuth;
    private String bookName;
    Reader(String nameAuth, String bookName){
        this.bookName = bookName;
        this.nameAuth = nameAuth;
    }
    private String name;
    private String surname;
    private int id;
    private String facultet;
    private int year;
    private int month;
    private int day;
    private long number;
    private String typeBook;
    void takeBook(){
        System.out.println("Author of " + bookName + " is " + nameAuth);
    }
    void takeBook(int countBook){
        System.out.println(name + surname.charAt(0) + "take " + countBook + "book" );
    }
    void takeBook(String typeBook, String typeBook1, String typeBook2){
        System.out.println(name + surname.charAt(0) + "take " + typeBook + typeBook1 + typeBook2);
    }
    void returnBook(int countBook){
        System.out.println(name + surname.charAt(0) + "return " + countBook + "book");
    }
}
