package Library;

public class Library {
    private Book[] bookShelf;
    private int numBooks;
    private static final int MAX_BOOKS = 10;
    private boolean[] availability;

    Library(){
        bookShelf = new Book[MAX_BOOKS];
        numBooks = 0;
        availability = new boolean[MAX_BOOKS];
        for(int i = 0; i < MAX_BOOKS; i++){
            availability[i] = false;
        }
    }
    private int findBookNum(Book[] bookShelf, String title){
        //can be improved by using binary search. I need to rearrange the isbn?
        for(int i = 0; i < numBooks; i++){
            if (bookShelf[i] == null){
                return -1;
            }
            else if (bookShelf[i].getTitle().equals(title)){
                return i;
            }
        }return -1;
    }


    public void addBook(String title, String author, String isbn){
        Book b = new Book(title, author, isbn);
        bookShelf[numBooks] = b;
        availability[numBooks] = true;
        numBooks++;
    }

    public void borrowBook(String title){
        int position = findBookNum(bookShelf, title);
        availability[position] = false;
    }

    public void returnBook(String title){
        int position = findBookNum(bookShelf, title);
        availability[position] = true;
    }

    public void getInformation(String title){
        int position = findBookNum(bookShelf, title);
        IBIO.output(bookShelf[position].getTitle());
        IBIO.output(bookShelf[position].getAuthor());
        IBIO.output(bookShelf[position].getIsbn());
    }

    public boolean checkAvailability(String title){
        int position = findBookNum(bookShelf, title);
        if (position == -1){
            return false;
        }
        return availability[position];
    }
}
