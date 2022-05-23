public class Main {
    public static void main(String[] args) {

        String [] bookArray = new String[4];

        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Александр", "Пушкин");
        Author author3 = new Author("Александр", "Дюма");
        Book book1 = new Book("Война и мир", author1, 1999);
        Book book2 = new Book("Евгений Онегин", author2, 2001);
        Book book3 = new Book("Евгений Осин", author3, 2008);
        bookArray [0] = String.valueOf(book1) ;
        bookArray [1] = String.valueOf(book2) ;

//        addBook(bookArray, String.valueOf(book1));
//        addBook(bookArray, String.valueOf(book2));

//        System.out.println("bookArray[1] = " + bookArray[1]);
        addBook(bookArray, String.valueOf(book3));
    }

    public static void addBook (String [] array, String book) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] !=null) {
                System.out.println("array [i] = " + array[i]);
//                array[i] = book ;
//                break;
            }  else
            {array [i] = book ;
            System.out.println("array[i] = " + array[i]);
            break;}

        }


//            else System.out.println("Добавление книги невозможно!");
        }
//        System.out.println("book1 = " + book1);

//        System.out.println("author1 = " + author1);

    }