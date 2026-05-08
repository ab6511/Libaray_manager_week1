package Model;

public class Book {
public int id;
String author;
String title;
public boolean Isissued;

public Book(int id,String author,String title){
    this.id=id;
    this.author=author;
    this.title=title;
    this.Isissued=false;

}

public void displayBook(){
    System.out.println(
            id+" " +
            title+" "+
            author+"Issued: "+Isissued
    );
}
}
