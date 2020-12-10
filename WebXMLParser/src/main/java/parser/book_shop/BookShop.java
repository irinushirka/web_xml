package parser.book_shop;

import java.util.ArrayList;

public class BookShop{
    public static int books_amount = 0;
    private ArrayList<Book> books;
    public BookShop(){
        books = new ArrayList<>();
    }
    public BookShop(ArrayList<Book> books){
        this.books = books;
        books_amount = this.books.size();
    }
    public void addBook(Book book){
        books.add(book);
        books_amount++;
    }
    public ArrayList<Book> showBooksData(){
    	return books;
    }
    public int countTotalCost(){
        int total_cost = 0;
        for (Book b: books) {
            total_cost += b.getPrice();
        }
        return total_cost;
    }
    public ArrayList<String> toStringArray(){
    	ArrayList<String> results = new ArrayList<>();
    	for(Book b: books) {
    		results.add(b.info() + "\n");
    		
    	}
    	return results;
    }
}
