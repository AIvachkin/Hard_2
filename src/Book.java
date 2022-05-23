public class Book {
    String title ;
    Author author ;
    int publishingYear ;

    public Book (String title, Author author, int publishingYear) {
        this.title = title ;
        this.author = author ;
        this.publishingYear = publishingYear ;
    }
    public String toString() {
        return this.title + ": " + this.author + ": " + this.publishingYear;
    }
}
