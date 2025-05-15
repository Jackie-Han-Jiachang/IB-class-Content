package Library;

public class LibraryMS {
    public static void main(String[] args) {
        Library lib = new Library();
        int option = 0;
        while (option != 5) {
            IBIO.output("Welcome to the library");
            IBIO.output("1. Add a book");
            IBIO.output("2. Borrow a book");
            IBIO.output("3. Return a book");
            IBIO.output("4. View book information");
            IBIO.output("5. Exit");
            IBIO.output("choose an option");
            option = IBIO.inputInt();
            //add a book
            if (option == 1) {
                IBIO.output("Enter the book title");
                String title = IBIO.input();
                IBIO.output("Enter the author");
                String author = IBIO.input();
                IBIO.output("Enter the isbn");
                String isbn = IBIO.input();
                lib.addBook(title, author, isbn);
            }

            //borrow a book
            if (option == 2){
                IBIO.output("Enter the book title you want to borrow");
                String title = IBIO.input();
                if (lib.checkAvailability(title)){
                    lib.borrowBook(title);
                    IBIO.output(title + " has been borrowed successfully");
                }else {
                    IBIO.output("We don't have that book");
                }
            }

            //return books
            if (option == 3){
                IBIO.output("Enter the book title you want to return");
                String title = IBIO.input();
                lib.returnBook(title);
                IBIO.output(title + " has been returned successfully");
            }

            //view information
            if (option == 4){
                IBIO.output("Enter the book title you want to view");
                String title = IBIO.input();
                lib.getInformation(title);
            }
        }
    }
}
