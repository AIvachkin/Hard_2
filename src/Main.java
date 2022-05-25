public class Main {
    public static void main(String[] args) {


        Library author1 = new Library ();
        Library author2 = new Library ();
        Library author3 = new Library ();
        author1.author("Лев", "Толстой") ;
        author2.author("Александр", "Дюма") ;
        author3.author("Евгений", "Осин") ;

        Library year1 = new Library ();
        Library year2 = new Library ();
        Library year3 = new Library ();
        year1.publishyngYear(1990) ;
        year2.publishyngYear(1995) ;
        year3.publishyngYear(2015) ;

        Library book1 = new Library ();
        Library book2 = new Library ();
        Library book3 = new Library ();
        book1.book("Война и мир", author1, year1) ;
        book2.book ("Снегурочка", author2, year2) ;
        book3.book("Солнце", author3, year3) ;

        String [] bookArray = new String[3];

        bookArray [0] = String.valueOf(book1) ;
        bookArray [1] = String.valueOf(book2) ;
        bookArray [2] = String.valueOf(book3) ;

        System.out.println("bookArray.length = " + bookArray.length);
    }}



