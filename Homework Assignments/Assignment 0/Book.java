public class Book {

    private String title;
    private String author;
    private long ISBN;
    private double price;
    private static int bookCount;
    //creates variables needed

    public Book(){
        this.title = "n/a";
        this.author ="n/a";
        this.ISBN = 0;
        this.price = 0.0;
        bookCount++;
    }
    //creates the default book object

    public Book(String title, String author, long ISBN, double price){
        setTitle(title);
        setAuthor(author);
        setISBN(ISBN);
        setPrice(price);
        bookCount++;
    }
    //creates the book object

    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setISBN(long ISBN){
        this.ISBN=ISBN;
    }
    public void setPrice(double price){
        this.price=price;
    }

    //setters
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public long getISBN(){
        return this.ISBN;
    }
    public double getPrice(){
        return this.price;
    }

    //getters
    public String toString(){
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nISBN: " + this.ISBN + "\nPrice: " + this.price;
    }
    //formats the to string
    public boolean equals(Book other){
        if (other.ISBN==this.ISBN && other.price==this.price){
            return true;
        }
        else{
            return false;
        }
    }
    //checks if books have the exact same information

    public static int findNumberOfCreatedBooks(){
        return bookCount;
    }
    //finds the number of created books

}
