package Service;

import Model.Book;
import Model.User;

import java.util.HashMap;

public class LibraryService {
HashMap<Integer, Book> books=new HashMap<>();
HashMap<Integer, User> users=new HashMap<>();


public void addBook(Book book){
    books.put(book.id,book);
}

public void adduser(User user){
    users.put(user.userid,user);
}

public void displayBooks(){
    for (Book b:books.values()){
        b.displayBook();
    }
}

public void IssueBook(int bookid) throws BookException {
    Book b=books.get(bookid);
    if(b==null){
        System.out.println("Book not found ");
        return;
    }
    if( b.Isissued){
       throw new BookException("Already issed");
    }
   b.Isissued=true;
        System.out.println("Book issued Successfully");
}

public void bookreturn(int bookid){
    Book b=books.get(bookid);
    if(b !=null && b.Isissued){
        b.Isissued=false;
        System.out.println("Book returned Successfully");
    }
}
}
