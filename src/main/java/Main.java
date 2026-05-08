import Model.Book;
import Service.BookException;
import Service.LibraryService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BookException {
        LibraryService service=new LibraryService();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("\n1.AddBook");
            System.out.println("2.View Book");
            System.out.println("3.Issue Book");
            System.out.println("4.Return Book");
            System.out.println("5.Exit");

            System.out.println("Enter your Choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter Book id:");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the title of the Book:");
                String title=sc.nextLine();
                System.out.println("Enter the Author name:");
                String author=sc.nextLine();

                service.addBook(new Book(id,title,author));
                System.out.println("Book Added Successfully....");
                break;
            case 2:
                service.displayBooks();
                break;

            case 3:
                System.out.println("Enter the Book id:");
                int Issedid=sc.nextInt();
                service.IssueBook(Issedid);
                break;
            case 4:
                System.out.println("Enter the Book id:");
                int returnId=sc.nextInt();
                service.bookreturn(returnId);
                break;
            case 5:
                System.exit(0);
        }
        }


    }
}
