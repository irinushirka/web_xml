package parser.book_shop;

public class Book {
    private String title;
    private String author;
    private int pages;
    private int price;
    public Book(){ }
    public Book(String title, String author, int pages, int price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getPages() {
        return pages;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public String info() {
    	return this.title + " " + this.author + " " + this.pages + " " + this.price;
    }
    
}
