package Model;

public class Book {
int id;
String author;
String title;
boolean Isissued;

Book(int id,String author,String title){
    this.id=id;
    this.author=author;
    this.title=title;
    this.Isissued=false;

}

void displayBook(){
    System.out.println(
            id+" " +
            title+" "+
            author+"Issued: "+Isissued
    );
}
}
